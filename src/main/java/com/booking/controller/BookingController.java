package com.booking.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.booking.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.booking.helper.BookingStatus;
import com.booking.service.AllergyService;
import com.booking.service.BookingService;
import com.booking.service.OutletService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @Autowired
    private AllergyService allergyService;

    @Autowired
    private OutletService outletService;

    @PostMapping(value = "/createBooking")
    public Booking saveBooking(@RequestBody Booking booking) {
        // List <Booking> bookingList = bookingRepo.findByResvDate ( date );
        List<Booking> bookingList = bookingService.getDataUsingVillaNoAndDate(booking.getVillaNo(), booking.getResvDate());
        if (bookingList != null && bookingList.size() >= 1) {
            booking = null;
        } else {

            booking = bookingService.saveBooking(booking);
        }
        return booking;
    }

    @PutMapping(value = "/updateBooking")
    public Booking updateBooking(@RequestBody Booking booking) {
        Optional<Booking> bookingFromDb = bookingService.getBookingById(booking.getReservationId());
        if (bookingFromDb.isPresent()) {
            booking = bookingService.saveBooking(booking);
        }
        return booking;
    }

    @GetMapping(value = "/getBooking")
    public List<Booking> getBooking() {
        List<Booking> bookingList = null;
        bookingList = bookingService.getAllBookingByDateAndStatus(new Date(), BookingStatus.ACTIVE.toString());
        return bookingList;
    }

    @GetMapping(value = "/getMasterData")
    public MasterDataResponse getMasterData() {
        MasterDataResponse masterDataResponse = new MasterDataResponse();

        List<MasterAllergy> allergies = allergyService.getAllAllergy();
        List<Outlet> outlets = outletService.getAllOutlet();
        masterDataResponse.setAllergies(allergies);
        masterDataResponse.setOutlets(outlets);
        return masterDataResponse;
    }

}
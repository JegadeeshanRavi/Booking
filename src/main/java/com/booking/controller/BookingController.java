package com.booking.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.booking.helper.BookingStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.model.Allergy;
import com.booking.model.Booking;
import com.booking.model.MasterDataResponse;
import com.booking.model.Outlet;
import com.booking.service.AllergyService;
import com.booking.service.BookingService;
import com.booking.service.OutletService;

@RestController
public class BookingController
{
	@Autowired
	private BookingService	bookingService;

	@Autowired
	private AllergyService	allergyService;

	@Autowired
	private OutletService	outletService;

	@PostMapping ( value = "/createBooking" )
	public Booking saveBooking ( Booking booking )
	{
		// List <Booking> bookingList = bookingRepo.findByResvDate ( date );
		List <Booking> bookingList = bookingService.getDataUsingVillaNoAndDate ( booking.getVillaNo (), booking.getResvDate () );
		if ( bookingList != null && bookingList.size () >= 1 )
		{
			booking = null;
		}
		else
		{
			booking.setStatus ( BookingStatus.ACTIVE.toString () );
			booking = bookingService.saveBooking ( booking );
		}
		return booking;
	}

	@PutMapping ( value = "/updateBooking" )
	public Booking updateBooking ( Booking booking )
	{
		Optional <Booking> bookingFromDb = bookingService.getBookingById ( booking.getReservationId () );
		if ( bookingFromDb.isPresent () )
		{
			booking = bookingService.saveBooking ( booking );
		}
		return booking;
	}

	@GetMapping ( value = "/getBooking" )
	public List <Booking> getBooking ()
	{
		List <Booking> bookingList = null;
		bookingList = bookingService.getAllBookingByDateAndStatus ( new Date (), BookingStatus.ACTIVE.toString () );
		return bookingList;
	}

	@GetMapping ( value = "/getMasterData" )
	public MasterDataResponse getMasterData ()
	{
		MasterDataResponse masterDataResponse = new MasterDataResponse ();

		List <Allergy> allergies = allergyService.getAllAllergy ();
		List <Outlet> outlets = outletService.getAllOutlet ();
		masterDataResponse.setAllergies ( allergies );
		masterDataResponse.setOutlets ( outlets );
		return masterDataResponse;
	}

}
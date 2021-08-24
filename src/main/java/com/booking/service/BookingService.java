package com.booking.service;

import com.booking.model.Booking;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BookingService
{
	 List <Booking> getAllBookingByDateAndStatus ( Date date, String status );

	 Booking saveBooking ( Booking booking );

	 List <Booking> getDataUsingVillaNoAndDate ( String villaNo, Date bookingDate );

	 Optional<Booking> getBookingById (int id );
}

package com.booking.serviceImpl;

import com.booking.model.Booking;
import com.booking.repo.BookingRepo;
import com.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService
{

	@Autowired
	private BookingRepo bookingRepo;

	@Override
	public List <Booking> getAllBookingByDateAndStatus ( Date date, String status )
	{
		return bookingRepo.findByStatusAndResvDate ( status, date );
	}

	@Override
	public Booking saveBooking ( Booking booking )
	{
		return bookingRepo.save ( booking );
	}

	public List <Booking> getDataUsingVillaNoAndDate ( String villaNo, Date bookingDate )
	{
		return bookingRepo.findByVillaNoAndResvDate ( villaNo, bookingDate );
	}

	@Override
	public Optional <Booking> getBookingById ( int id )
	{
		return bookingRepo.findById ( id );
	}
}

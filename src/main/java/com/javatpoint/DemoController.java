package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DemoController
{
	@Autowired
	BookingRepo bookingRepo;

	@RequestMapping ( "/" )
	public String index ()
	{
		// returns to index.html
		return "index";
	}

	@RequestMapping ( value = "/saved", method = RequestMethod.POST )
	public ModelAndView save ( @ModelAttribute User user )
	{
		ModelAndView modelAndView = new ModelAndView ();
		modelAndView.setViewName ( "user-data" );
		modelAndView.addObject ( "user", user );
		return modelAndView;
	}

	@RequestMapping ( value = "/save", method = RequestMethod.POST )
	public ModelAndView saveBooking ( @ModelAttribute Booking booking ) throws ParseException
	{
		ModelAndView modelAndView = new ModelAndView ();
		modelAndView.setViewName ( "index" );

		// List <Booking> bookingList = bookingRepo.findByResvDate ( date );
		List <Booking> bookingList = bookingRepo.findByVillaNoAndResvDate ( booking.getVillaNo (), booking.getResvDate () );
		if ( bookingList != null && bookingList.size () >= 1 )
		{
			modelAndView.addObject ( "failure", "Booking already exists." );
		}
		else
		{
			bookingRepo.save ( booking );
			modelAndView.addObject ( "success", "Booking created successfully." );
		}

		return modelAndView;
	}

	@GetMapping ( value = "/getBooking" )
	public ModelAndView getBooking () throws ParseException
	{
		ModelAndView modelAndView = new ModelAndView ();
		modelAndView.setViewName ( "user-data" );

		// List <Booking> bookingList = bookingRepo.findByResvDate ( date );
		List <Booking> bookingList = bookingRepo.findAll ();
		if ( bookingList != null )
		{
			modelAndView.addObject ( "data", bookingList );
		}

		return modelAndView;
	}
}
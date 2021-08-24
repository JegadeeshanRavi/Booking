package com.booking.repo;

import com.booking.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookingRepo extends CrudRepository <Booking, Integer>
{
	List <Booking> findByVillaNoAndResvDate ( String villaNo, Date resvDate );

	List <Booking> findByStatusAndResvDateBetween ( String status, Date resvDate, Date endDate );

	@Override
	List <Booking> findAll ();

}

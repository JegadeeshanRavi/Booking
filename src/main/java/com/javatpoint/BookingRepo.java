package com.javatpoint;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BookingRepo extends CrudRepository <Booking, Integer>
{
	public List <Booking> findByVillaNoAndResvDate ( String villaNo, Date resvDate );

	public List <Booking> findByResvDate ( Date resvDate );

	@Override
	List <Booking> findAll ();

}

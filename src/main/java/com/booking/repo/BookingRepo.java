package com.booking.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.booking.model.Booking;

@Repository
public interface BookingRepo extends CrudRepository <Booking, Integer>
{
	List <Booking> findByVillaNoAndResvDate ( String villaNo, Date resvDate );

	@Query ( "SELECT u FROM Booking u WHERE u.bookType = :status and u.resvDate >= :resvDate" )
	List <Booking> findByBookTypeAndResvDate ( @Param ( "status" ) String status, @Param ( "resvDate" ) Date resvDate );

	@Override
	List <Booking> findAll ();

}

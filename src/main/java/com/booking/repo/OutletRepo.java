package com.booking.repo;

import com.booking.model.Booking;
import com.booking.model.Outlet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutletRepo extends CrudRepository <Outlet, Integer>
{
	@Override
	List <Outlet> findAll ();
}

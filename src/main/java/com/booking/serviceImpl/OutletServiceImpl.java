package com.booking.serviceImpl;

import com.booking.model.Outlet;
import com.booking.repo.OutletRepo;
import com.booking.service.OutletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutletServiceImpl implements OutletService
{

	@Autowired
	private OutletRepo outletRepo;

	@Override
	public List <Outlet> getAllOutlet ()
	{
		return outletRepo.findAll ();
	}
}

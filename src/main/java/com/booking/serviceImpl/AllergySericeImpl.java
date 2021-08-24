package com.booking.serviceImpl;

import com.booking.model.Allergy;
import com.booking.repo.AllergyRepo;
import com.booking.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergySericeImpl implements AllergyService
{

	@Autowired
	private AllergyRepo allergyRepo;
	@Override
	public List <Allergy> getAllAllergy ()
	{
		return allergyRepo.findAll ();
	}
}

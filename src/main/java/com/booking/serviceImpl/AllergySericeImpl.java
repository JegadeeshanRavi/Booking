package com.booking.serviceImpl;

import com.booking.model.Allergy;
import com.booking.model.MasterAllergy;
import com.booking.repo.AllergyRepo;
import com.booking.repo.MasterAllergyRepo;
import com.booking.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergySericeImpl implements AllergyService {

    @Autowired
    private MasterAllergyRepo allergyRepo;

    @Override
    public List<MasterAllergy> getAllAllergy() {
        return allergyRepo.findAll();
    }
}

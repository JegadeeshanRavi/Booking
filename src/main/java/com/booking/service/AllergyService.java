package com.booking.service;

import com.booking.model.Allergy;
import com.booking.model.MasterAllergy;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AllergyService {

    List<MasterAllergy> getAllAllergy();

}

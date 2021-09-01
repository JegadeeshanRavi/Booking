package com.booking.repo;

import com.booking.model.Allergy;
import com.booking.model.MasterAllergy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterAllergyRepo extends CrudRepository<MasterAllergy, Integer> {
    @Override
    List<MasterAllergy> findAll();
}

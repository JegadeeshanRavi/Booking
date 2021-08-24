package com.booking.repo;

import com.booking.model.Allergy;
import com.booking.model.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllergyRepo extends CrudRepository <Allergy, Integer>
{
    @Override
    List<Allergy> findAll ();
}

package com.booking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MasterAllergy {

    @Id
    @JsonIgnore
    private int allergyId;
    private String allergyName;

    public int getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(int allergyId) {
        this.allergyId = allergyId;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    @Override
    public String toString() {
        return "Allergy{" + "allergyId=" + allergyId + ", alleryName='" + allergyName + '\'' + '}';
    }
}

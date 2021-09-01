package com.booking.model;

import java.util.List;

public class MasterDataResponse {
    private List<MasterAllergy> allergies;

    private List<Outlet> outlets;

    public List<MasterAllergy> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<MasterAllergy> allergies) {
        this.allergies = allergies;
    }

    public List<Outlet> getOutlets() {
        return outlets;
    }

    public void setOutlets(List<Outlet> outlets) {
        this.outlets = outlets;
    }

    @Override
    public String toString() {
        return "MasterDataResponse{" + "allergies=" + allergies + ", outlets=" + outlets + '}';
    }
}

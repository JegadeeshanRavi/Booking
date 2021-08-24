package com.booking.model;

import java.util.List;

public class MasterDataResponse
{
	private List <Allergy>	allergies;

	private List <Outlet>	outlets;

	public List <Allergy> getAllergies ()
	{
		return allergies;
	}

	public void setAllergies ( List <Allergy> allergies )
	{
		this.allergies = allergies;
	}

	public List <Outlet> getOutlets ()
	{
		return outlets;
	}

	public void setOutlets ( List <Outlet> outlets )
	{
		this.outlets = outlets;
	}

	@Override
	public String toString ()
	{
		return "MasterDataResponse{" + "allergies=" + allergies + ", outlets=" + outlets + '}';
	}
}

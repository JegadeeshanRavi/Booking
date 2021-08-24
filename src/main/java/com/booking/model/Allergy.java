package com.booking.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Allergy
{

	@Id
	private int		allergyId;
	private String	allergyName;

	public int getAllergyId ()
	{
		return allergyId;
	}

	public void setAllergyId ( int allergyId )
	{
		this.allergyId = allergyId;
	}

	public String getAllergyName ()
	{
		return allergyName;
	}

	public void setAllergyName ( String allergyName )
	{
		this.allergyName = allergyName;
	}

	@Override
	public String toString ()
	{
		return "Allergy{" + "allergyId=" + allergyId + ", alleryName='" + allergyName + '\'' + '}';
	}
}

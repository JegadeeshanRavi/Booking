package com.booking.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Allergy implements Serializable
{

	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALLERGY_SEQ")

	@SequenceGenerator(name = "ALLERGY_SEQ", sequenceName = "allergy_id_seq", allocationSize = 1)
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

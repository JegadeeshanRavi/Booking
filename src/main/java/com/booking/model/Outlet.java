package com.booking.model;

import javax.persistence.*;

@Entity
public class Outlet
{
	@Id
	private int		outletId;
	private String	outletName;

	public int getOutletId ()
	{
		return outletId;
	}

	public void setOutletId ( int outletId )
	{
		this.outletId = outletId;
	}

	public String getOutletName ()
	{
		return outletName;
	}

	public void setOutletName ( String outletName )
	{
		this.outletName = outletName;
	}

	@Override
	public String toString ()
	{
		return "Outlet{" + "outletId=" + outletId + ", outletName='" + outletName + '\'' + '}';
	}
}

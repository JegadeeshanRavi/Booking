package com.booking.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Booking implements Serializable
{

	@Id
	@GeneratedValue ( strategy = GenerationType.SEQUENCE, generator = "BOOKING_SEQ" )

	@SequenceGenerator ( name = "BOOKING_SEQ", sequenceName = "booking_reservation_id_seq", allocationSize = 1 )

	private int		reservationId;
	private String	outlet;
	private String	villaNo;
	private String	guestName;
	private String	mealPlan;
	private int		noOfPax;
	private int		noOfTables;
	@DateTimeFormat ( pattern = "yyyy-MM-dd'T'HH:mm" )
	private Date	resvDate;

	private String	bookedBy;
	private String	bookedDt;
	private String	foodAllergy;
	private String	remarks;
	private String	status;

	public Booking ()
	{
	}

	public int getReservationId ()
	{
		return reservationId;
	}

	public void setReservationId ( int reservationId )
	{
		this.reservationId = reservationId;
	}

	public String getOutlet ()
	{
		return outlet;
	}

	public void setOutlet ( String outlet )
	{
		this.outlet = outlet;
	}

	public String getVillaNo ()
	{
		return villaNo;
	}

	public void setVillaNo ( String villaNo )
	{
		this.villaNo = villaNo;
	}

	public String getGuestName ()
	{
		return guestName;
	}

	public void setGuestName ( String guestName )
	{
		this.guestName = guestName;
	}

	public String getMealPlan ()
	{
		return mealPlan;
	}

	public void setMealPlan ( String mealPlan )
	{
		this.mealPlan = mealPlan;
	}

	public int getNoOfPax ()
	{
		return noOfPax;
	}

	public void setNoOfPax ( int noOfPax )
	{
		this.noOfPax = noOfPax;
	}

	public int getNoOfTables ()
	{
		return noOfTables;
	}

	public void setNoOfTables ( int noOfTables )
	{
		this.noOfTables = noOfTables;
	}

	public String getBookedBy ()
	{
		return bookedBy;
	}

	public void setBookedBy ( String bookedBy )
	{
		this.bookedBy = bookedBy;
	}

	public String getBookedDt ()
	{
		return bookedDt;
	}

	public void setBookedDt ( String bookedDt )
	{
		this.bookedDt = bookedDt;
	}

	public String getFoodAllergy ()
	{
		return foodAllergy;
	}

	public void setFoodAllergy ( String foodAllergy )
	{
		this.foodAllergy = foodAllergy;
	}

	public String getRemarks ()
	{
		return remarks;
	}

	public void setRemarks ( String remarks )
	{
		this.remarks = remarks;
	}

	public Date getResvDate ()
	{
		return resvDate;
	}

	public void setResvDate ( Date resvDate )
	{
		this.resvDate = resvDate;
	}

	public String getStatus ()
	{
		return status;
	}

	public void setStatus ( String status )
	{
		this.status = status;
	}

	@Override
	public String toString ()
	{
		return "Booking{" + "reservationId=" + reservationId + ", outlet='" + outlet + '\'' + ", villaNo='" + villaNo + '\'' + ", guestName='" + guestName + '\'' + ", mealPlan='" + mealPlan + '\'' + ", noOfPax=" + noOfPax + ", noOfTables=" + noOfTables + ", resvDate=" + resvDate + ", bookedBy='" + bookedBy + '\'' + ", bookedDt='" + bookedDt + '\'' + ", foodAllergy='" + foodAllergy + '\'' + ", remarks='" + remarks + '\'' + ", status='" + status + '\'' + '}';
	}
}

package com.booking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKING_SEQ")

    @SequenceGenerator(name = "BOOKING_SEQ", sequenceName = "booking_reservation_id_seq", allocationSize = 1)

    private int reservationId;
    @JsonProperty(required = true)
    private String outlet;
    @JsonProperty(required = true)
    private String villaNo;
    @JsonProperty(required = true)
    private String mealPlan;
    @JsonProperty(required = true)
    private int noOfPax;
    @JsonProperty(required = true)
    private int noOfTables;
    @JsonProperty(required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    private Date resvDate;
    @JsonProperty(required = true)
    private String bookedBy;


    private String remarks;
    @JsonProperty(required = true)
    private String bookType;

    @JsonProperty(required = true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "reservation_id", referencedColumnName = "reservationId")
    private List<UserDetails> guestName;

    public Booking() {
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    public String getVillaNo() {
        return villaNo;
    }

    public void setVillaNo(String villaNo) {
        this.villaNo = villaNo;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public int getNoOfPax() {
        return noOfPax;
    }

    public void setNoOfPax(int noOfPax) {
        this.noOfPax = noOfPax;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public void setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
    }

    public Date getResvDate() {
        return resvDate;
    }

    public void setResvDate(Date resvDate) {
        this.resvDate = resvDate;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public List<UserDetails> getGuestName() {
        return guestName;
    }

    public void setGuestName(List<UserDetails> guestName) {
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "reservationId=" + reservationId +
                ", outlet='" + outlet + '\'' +
                ", villaNo='" + villaNo + '\'' +
                ", mealPlan='" + mealPlan + '\'' +
                ", noOfPax=" + noOfPax +
                ", noOfTables=" + noOfTables +
                ", resvDate=" + resvDate +
                ", bookedBy='" + bookedBy + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status='" + bookType + '\'' +
                ", userDetails=" + guestName +
                '}';
    }
}

package com.example.tripease.Entities;

import com.example.tripease.Enum.Trip;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    private String pickup;
    private String destination;
    private double tripDistanceInKm;
    private Trip tripStatus;
    private double billAmount;

    @CreationTimestamp
    private Date bookedAt;

    @UpdateTimestamp
    private Date lastUpdateAt;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getTripDistanceInKm() {
        return tripDistanceInKm;
    }

    public void setTripDistanceInKm(double tripDistanceInKm) {
        this.tripDistanceInKm = tripDistanceInKm;
    }

    public Trip getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(Trip tripStatus) {
        this.tripStatus = tripStatus;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public Date getBookedAt() {
        return bookedAt;
    }

    public void setBookedAt(Date bookedAt) {
        this.bookedAt = bookedAt;
    }

    public Date getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(Date lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }
}

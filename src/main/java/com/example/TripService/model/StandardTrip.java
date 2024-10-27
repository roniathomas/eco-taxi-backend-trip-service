package com.example.TripService.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "standard_trips")  // Defines the table for StandardTrip
public class StandardTrip extends Trip {

    // Constructor with all fields
    public StandardTrip(int tripId, int userId, TripStatus tripStatus, String pickupLocation, String destination, Date date, int tripRating) {
        super(tripId, userId, tripStatus, pickupLocation, destination, date, tripRating);
    }

    // Default constructor
    public StandardTrip() {
        super();  // Calls the default constructor of the parent class (Trip)
    }

    // Method to get trip rating
    public int getTripRating() {
        return super.getTripRating();
    }

    // Method to set trip rating
    public void setTripRating(int tripRating) {
        super.setTripRating(tripRating);
    }
}

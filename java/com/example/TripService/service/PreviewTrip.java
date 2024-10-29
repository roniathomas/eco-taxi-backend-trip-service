package com.example.TripService.service;

import com.example.TripService.factory.TripCreator;
import com.example.TripService.factory.TripFactory;
import com.example.TripService.model.Trip;

import java.util.Date;

public class PreviewTrip extends TripAction{
    private final TripFactory tripCreator;

    public PreviewTrip() {
        tripCreator = new TripCreator();
    }

    @Override
    public TripResponse execute(TripRequest request) {
        String pickup = request.getPickup();
        String destination = request.getDestination();

        // Communicate with API to find nearest locations
        String adjustedPickup;
        String adjustedDestination;

        // Communicate with API to find
        rainfall, traffic..

        // Communicate with API to find
        double distance;
        double fare = calculateFare(distance);
        int num_of_available_taxis; // in user's 'region'
        int estimated_waiting_time = calculateWaitingTime(num_of_available_taxis);
        double[] nearest_taxi_coordinates;

        // Add Trip into database as incomplete
        Trip trip = tripCreator.createTrip(adjustedPickup, adjustedDestination, new Date(), userId);

        return SearchTripPreviewResponse.newBuilder()
                .setResult(adjustedPickup)
                .setResult(adjustedDestination)
                .setResult(distance)
                .setResult(fare)
                .setResult(estimated_arrival_date_time)
                .setResult(num_of_available_taxis)
                .setResult(nearest_taxi_coordinates)
                .build();
    }

    private double calculateFare(double distance){
        double rate; // can make it dependent on time of day
        return rate*distance;
    }

    private int calculateWaitingTime(int no_of_available_taxis){
        double multiplier; // can be dependent on time of day
        return (int) (no_of_available_taxis * multiplier);
    }

    private int calculateTravelTime(double distance, Rainfall rainfall, Traffic traffic){
        return (int)
    }


}

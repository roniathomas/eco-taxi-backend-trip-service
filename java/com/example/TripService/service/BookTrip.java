package com.example.TripService.service;

public class BookTrip extends TripAction{
    @Override
    public TripResponse execute(TripRequest request) {
        String pickup = request.getPickup();
        String destination = request.getDestination();

    }
}

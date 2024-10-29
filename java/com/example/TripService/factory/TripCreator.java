package com.example.TripService.factory;

import com.example.TripService.model.StandardTrip;
import com.example.TripService.model.Trip;

public class TripCreator extends TripFactory {
    public TripCreator() {}

    @Override
    public Trip createTrip() {
        return new StandardTrip();
    }
}

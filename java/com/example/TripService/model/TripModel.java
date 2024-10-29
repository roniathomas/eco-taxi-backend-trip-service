package com.example.TripService.model;

import com.example.TripService.factory.ActionFactory;
import com.example.TripService.repository.TripRepository;
import com.example.TripService.service.*;

public class TripModel {
    private final TripRepository tripRepository;
    private final ActionFactory actionFactory;  // Use the interface

    public TripModel(TripRepository tripRepository, ActionFactory actionFactory) {
        this.tripRepository = tripRepository;
        this.actionFactory = actionFactory;
    }

    public TripResponse service(TripRequest request) {
        TripAction action = actionFactory.getAction(request.getRequestType());
        if (action != null) {
            return action.execute(request);  // Execute the action
        }
        return null;
    }
}

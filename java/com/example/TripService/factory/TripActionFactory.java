package com.example.TripService.factory;

import com.example.TripService.controller.RequestType;
import com.example.TripService.service.*;

import java.util.HashMap;
import java.util.Map;

public class TripActionFactory implements ActionFactory {
    private final Map<RequestType, TripAction> actionRegistry;

    public TripActionFactory() {
        actionRegistry = new HashMap<>();
        actionRegistry.put(RequestType.BOOK_TRIP, new BookTrip());
        actionRegistry.put(RequestType.CANCEL_TRIP, new CancelTrip());
        actionRegistry.put(RequestType.PREVIEW_TRIP, new PreviewTrip());
        actionRegistry.put(RequestType.VIEW_TRIPS, new ViewTrips());
    }

    @Override
    public TripAction getAction(RequestType requestType) {
        return actionRegistry.get(requestType);
    }
}

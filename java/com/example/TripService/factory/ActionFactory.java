package com.example.TripService.factory;

import com.example.TripService.controller.RequestType;
import com.example.TripService.service.TripAction;

public interface ActionFactory {
    TripAction getAction(RequestType requestType);
}

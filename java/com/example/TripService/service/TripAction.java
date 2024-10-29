package com.example.TripService.service;

import com.example.TripService.model.Trip;
import com.example.TripService.repository.Repository;
import com.example.TripService.repository.TripRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public abstract class TripAction {
    protected TripRepository tripRepository;

    public TripAction() {
    }
    public abstract TripResponse execute(TripRequest request);
}


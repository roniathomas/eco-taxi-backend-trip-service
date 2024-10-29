package com.example.TripService.service;

import com.example.TripService.model.Trip;

import java.util.ArrayList;
import java.util.Comparator;

public class ViewTrips extends TripAction {
    private Object Comparator;

    @Override
    public TripResponse execute(TripRequest request) {
        int page = request.getPage() - 1;
        int limit = request.getLimit(); //limit per page
        int id = request.getUser_id();
        ArrayList <BookingStatus> statuses = request.getBooking_statuses();
        boolean order = request.getOrder_asc();

        // read from repository/ database
        ArrayList<Trip> allTrips = tripRepository.findAllByUserId(id);
        // sort by date
        allTrips.sort(Comparator.comparing(Trip::getDate));
        ArrayList<Trip> tripsOnPage = (ArrayList<Trip>) allTrips.subList(page * limit, Math.min(page * limit + limit, allTrips.size()));

        Pagination pagination = new Pagination(page + 1, limit, allTrips.size());

        return GetBookingHistoryResponse.newBuilder()
                .setResult(pagination)
                .setResult(tripsOnPage)
                .build();
    }
}

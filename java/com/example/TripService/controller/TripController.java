package com.example.TripService.controller;

import com.example.TripService.model.TripModel;
import io.grpc.stub.StreamObserver;

public class TripServiceController extends TripServiceGrpc.TripServiceImplBase {
    private final TripModel tripService; // Your model class handling the logic

    public TripServiceController(TripModel tripService) {
        this.tripService = tripService;
    }

    public void action(TripRequest request, StreamObserver<ConfirmBookingResponse> responseObserver) {
        // Check the type of the request
        if (request instanceof ConfirmBookingRequest) {
            ConfirmBookingRequest confirmBookingRequest = (ConfirmBookingRequest) request; // Cast to specific type
            ConfirmBookingResponse response = tripService.service(confirmBookingRequest); // Call the appropriate service method
            responseObserver.onNext(response);
        } else if (request instanceof SearchTripPreviewRequest) {
            SearchTripPreviewRequest searchTripPreviewRequest = (SearchTripPreviewRequest) request; // Cast to specific type
            SearchTripPreviewResponse response = tripService.service(searchTripPreviewRequest); // Call the appropriate service method
            responseObserver.onNext(response);
        } else if (request instanceof GetBookingHistoryRequest) {
            GetBookingHistoryRequest getBookingHistoryRequest = (GetBookingHistoryRequest) request; // Cast to specific type
            GetBookingHistoryResponse response = tripService.service(getBookingHistoryRequest); // Call the appropriate service method
            responseObserver.onNext(response);
        } else if (request instanceof UpdateBookingRequest) {
            UpdateBookingRequest updateBookingRequest = (UpdateBookingRequest) request; // Cast to specific type
            UpdateBookingResponse response = tripService.service(updateBookingRequest); // Call the appropriate service method
            responseObserver.onNext(response);
        }
        // Add more else-if blocks for other request types as needed
        else {
            // Handle unknown request types
            responseObserver.onError(new IllegalArgumentException("Invalid request type"));
            return;
        }

        responseObserver.onCompleted();
    }

}

package com.example.TripService;

import com.example.TripService.model.StandardTrip;
import com.example.TripService.model.Trip.TripStatus;
import com.example.TripService.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.Date;

@SpringBootApplication
public class TripServiceApplication implements CommandLineRunner {

    @Autowired
    private TripRepository tripRepository;

    public static void main(String[] args) {
        SpringApplication.run(TripServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create and save a new StandardTrip
        StandardTrip stdTrip = new StandardTrip(1, 1, TripStatus.IN_PROGRESS, "NTU", "Home", new Date(), 5);
        tripRepository.save(stdTrip);  // Save to the database
        System.out.println("Trip saved: " + stdTrip);
    }
}

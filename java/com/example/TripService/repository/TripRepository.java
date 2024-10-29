package com.example.TripService.repository;
import com.example.TripService.model.Trip;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TripRepository extends JpaRepository<Trip, Integer> {

    public ArrayList<Trip> findAllByUserId(int userId);
}

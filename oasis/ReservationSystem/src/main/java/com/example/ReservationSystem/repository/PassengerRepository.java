package com.example.ReservationSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.ReservationSystem.model.Passenger;
import com.example.ReservationSystem.model.Reservation;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
	
	Passenger findByPassengerName(String PassengerName);
	
}
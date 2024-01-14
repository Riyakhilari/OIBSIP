package com.example.ReservationSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.ReservationSystem.model.*;


public interface ReservationRepository extends CrudRepository<Reservation, Long> {

	Reservation findById(long id);

	List<Reservation> findByPassenger(Passenger passenger);
}

package com.example.ReservationSystem.service;

//ReservationService.java

import java.util.List;

import com.example.ReservationSystem.model.Reservation;
import com.example.ReservationSystem.model.Train;

public interface ReservationService {
	
	 void makeReservation(Long trainId, Long passengerId);
	 
	 List<Reservation> getAllReservations();

	 List<Train> getAllTrain();
	 
	 List<Reservation> GetReservationByName(String PassengerName);
	 
	 Reservation findByPnrNumber(int pnrNumber);
	 
	 void deleteByPnrNumber(int pnrNumber);
}

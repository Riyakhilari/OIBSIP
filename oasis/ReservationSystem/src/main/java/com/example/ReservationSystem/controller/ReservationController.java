package com.example.ReservationSystem.controller;

import com.example.ReservationSystem.model.Reservation;
import com.example.ReservationSystem.model.Train;

//ReservationController.java


import com.example.ReservationSystem.service.ReservationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
 private final ReservationService reservationService;

 @Autowired
 public ReservationController(ReservationService reservationService) {
     this.reservationService = reservationService;
 }

 
 
 @RequestMapping("/searchReservation")
 public ResponseEntity<List<Reservation>> searchReservation(@RequestParam String PassengerName){
	 
	 System.out.print(PassengerName+"\n");
	 List<Reservation> reservations = reservationService.GetReservationByName(PassengerName);
	 return ResponseEntity.ok(reservations);
	 
	 
	 //http://localhost:8000/api/reservation/searchReservation?PassengerName=David%20Lee
 }
 
 @GetMapping("/getAll")
 public ResponseEntity<List<Reservation>> getAllReservations() {
     List<Reservation> reservations = reservationService.getAllReservations();
     return ResponseEntity.ok(reservations);
 }
 
 @GetMapping("/getAllTrain")
 public ResponseEntity<List<Train>> getAllTrain(){
	 List<Train> reservations = reservationService.getAllTrain();
     return ResponseEntity.ok(reservations);
    
 }
 
 
 
 
 @GetMapping("/searchReservationPNR")
 public ResponseEntity<?> searchReservation(@RequestParam("pnrNumber") int pnrNumber) {
     Reservation reservation = reservationService.findByPnrNumber(pnrNumber);

     if (reservation != null) {
         return ResponseEntity.ok(reservation);
     } else {
         return ResponseEntity.notFound().build();
     }
     
     //http://localhost:8000/api/reservation/searchReservationPNR?pnrNumber=12345
 }
 
 @RequestMapping("/deleteReservation")
 public ResponseEntity<String> deleteReservation(@RequestParam("pnrNumber") int pnrNumber) {
	 
     try {
    	 reservationService.deleteByPnrNumber(pnrNumber);
    	 return ResponseEntity.ok("Reservation deleted successfully");
    	// http://localhost:8000/api/reservation/deleteReservation?pnrNumber=12345
    		 
     } catch (Exception e) {
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting reservation");
     }
     
 }
 
 
 
 
 @PostMapping("/make")
 public ResponseEntity<String> makeReservation(@RequestParam Long trainId, @RequestParam Long passengerId) {
     reservationService.makeReservation(trainId, passengerId);
     return ResponseEntity.ok("Reservation successful");
 }
 
 
}

 



package com.example.ReservationSystem.service;



//ReservationServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Query;
import com.example.ReservationSystem.model.*;
import com.example.ReservationSystem.repository.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
 private final ReservationRepository reservationRepository;
 private final TrainRepository trainRepository;
 private final PassengerRepository passengerRepository;

 
 @PersistenceContext
 private EntityManager entityManager;
 
 @Autowired
 public ReservationServiceImpl(ReservationRepository reservationRepository,
                               TrainRepository trainRepository,
                               PassengerRepository passengerRepository) {
     this.reservationRepository = reservationRepository;
     this.trainRepository = trainRepository;
     this.passengerRepository = passengerRepository;
 }

 @Override
 public void makeReservation(Long trainId, Long passengerId) {
     Train train = trainRepository.findById(trainId).orElseThrow(() -> new RuntimeException("Train not found"));
     Passenger passenger = passengerRepository.findById(passengerId).orElseThrow(() -> new RuntimeException("Passenger not found"));

     Reservation reservation = new Reservation();
     reservation.setTrain(train);
     reservation.setPassenger(passenger);

     // You may want to generate and set the PNR number here (if it's not set automatically)

     reservationRepository.save(reservation);
 }


 @Override
 public List<Reservation> getAllReservations() {
     return (List<Reservation>) reservationRepository.findAll();
 }
 
 @Override
 public List<Train> getAllTrain() {
     return  (List<Train>) trainRepository.findAll();
 }

 @Override
 public List<Reservation> GetReservationByName(String PassengerName){
	 System.out.print("Reservation method : "+PassengerName+"\n");
	 Passenger obj=passengerRepository.findByPassengerName(PassengerName);	 
	 return reservationRepository.findByPassenger(obj); 
 }
 
 @Override
 public Reservation findByPnrNumber(int pnrNumber) {
     // Use JPQL (Java Persistence Query Language) to write a query
     String jpql = "SELECT r FROM Reservation r WHERE r.pnrRecord.pnrNumber = :pnrNumber";
     TypedQuery<Reservation> query = entityManager.createQuery(jpql, Reservation.class);
     query.setParameter("pnrNumber", pnrNumber);

     try {
         return query.getSingleResult();
     } catch (NoResultException e) {
         return null; // Handle if no reservation is found
     }
 }
 
 
 
 @Override
 public void deleteByPnrNumber(int pnrNumber) {
     try {
         String jpql = "DELETE FROM Reservation r WHERE r.pnrRecord.pnrNumber = :pnrNumber";
         Query query = entityManager.createQuery(jpql);
         query.setParameter("pnrNumber", pnrNumber);

         int deletedCount = query.executeUpdate();

         System.out.println(deletedCount + " reservation(s) deleted for PNR number: " + pnrNumber);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }

 
 
}

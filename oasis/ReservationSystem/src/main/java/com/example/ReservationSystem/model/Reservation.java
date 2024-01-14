package com.example.ReservationSystem.model;

import jakarta.persistence.*;

//Reservation.java

@Entity
public class Reservation {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @ManyToOne
	 private Train train;
	 @ManyToOne
	 private Passenger passenger;
	 @Embedded
	 private PnrRecord pnrRecord;
	 
	
	
	/**
	 * @param id
	 * @param train
	 * @param passenger
	 * @param pnrRecord
	 */
	public Reservation(Long id, Train train, Passenger passenger, PnrRecord pnrRecord) {
		this.id = id;
		this.train = train;
		this.passenger = passenger;
		this.pnrRecord = pnrRecord;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Train getTrain() {
		return train;
	}



	public void setTrain(Train train) {
		this.train = train;
	}



	public Passenger getPassenger() {
		return passenger;
	}



	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}



	public PnrRecord getPnrRecord() {
		return pnrRecord;
	}



	public void setPnrRecord(PnrRecord pnrRecord) {
		this.pnrRecord = pnrRecord;
	}



	public Reservation() {}
	/**
	 * @param id
	 * @param train
	 * @param passenger
	 */
	
 
}

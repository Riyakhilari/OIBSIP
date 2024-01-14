package com.example.ReservationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Train {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private int trainNumber;
 private String trainName;
 
 
 
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	
	public Train( int trainNumber, String trainName) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
	}
	
	
	
	public Train() {}
	@Override
	public String toString() {
		return "Train [id=" + id + ", trainNumber=" + trainNumber + ", trainName=" + trainName + "]";
	}
	
 
}

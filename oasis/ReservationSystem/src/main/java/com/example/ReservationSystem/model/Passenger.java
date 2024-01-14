package com.example.ReservationSystem.model;

// Passenger.java


import jakarta.persistence.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passengerName;
    private int seatNumber;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	
	/**
	 * @param id
	 * @param passengerName
	 * @param seatNumber
	 */
	
	public Passenger() {}
	public Passenger(Long id, String passengerName, int seatNumber) {
		super();
		this.id = id;
		this.passengerName = passengerName;
		this.seatNumber = seatNumber;
	}
    
    
    
    
}

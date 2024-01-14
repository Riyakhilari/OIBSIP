package com.example.ReservationSystem.model;

public class PnrRecord {
    private int pnrNumber;
    private String passengerName;
    private String trainNumber;
    private String classType;
    private String journeyDate;
    private String fromDestination;
    private String toDestination;
	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getFromDestination() {
		return fromDestination;
	}
	public void setFromDestination(String fromDestination) {
		this.fromDestination = fromDestination;
	}
	public String getToDestination() {
		return toDestination;
	}
	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}
	/**
	 * @param pnrNumber
	 * @param passengerName
	 * @param trainNumber
	 * @param classType
	 * @param journeyDate
	 * @param fromDestination
	 * @param toDestination
	 */
	public PnrRecord(int pnrNumber, String passengerName, String trainNumber, String classType, String journeyDate,
			String fromDestination, String toDestination) {
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.trainNumber = trainNumber;
		this.classType = classType;
		this.journeyDate = journeyDate;
		this.fromDestination = fromDestination;
		this.toDestination = toDestination;
	}
	public PnrRecord() {}
    
    
}

package org.cap.passengermngt.entities;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PassengerDetails")
public class Passenger {

	@Id
	@GeneratedValue
	@Column(name = "PnrNumber")
	private BigInteger pnrNumber;

	@Column(name = "Passenger_Name")
	private String passengerName;

	@Column(name = "Passenger_Age")
	private Integer passengerAge;

	@Column(name = "Passenger_UIN")
	private BigInteger passengerUIN;

	@Column(name = "Passenger_Luggage")
	private double luggage;

	@ElementCollection
	@Column(name = "Passenger_List")
	private List<BigInteger> passengerList = new ArrayList<>();
	
	public Passenger() {
		super();
	}
	
	public Passenger(BigInteger pnrNumber, String passengerName, Integer passengerAge, BigInteger passengerUIN,
			double luggage, List<BigInteger> passengerList) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
		this.passengerList = passengerList;
	}

	public BigInteger getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(BigInteger pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public BigInteger getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(BigInteger passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public double getLuggage() {
		return luggage;
	}

	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}

	public List<BigInteger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<BigInteger> passengerList) {
		this.passengerList = passengerList;
	}
	
	
	
	
}

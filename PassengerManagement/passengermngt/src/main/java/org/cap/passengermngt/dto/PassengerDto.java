package org.cap.passengermngt.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;

import org.cap.passengermngt.entities.Passenger;

public class PassengerDto {

	private String passengerName;
	private Integer passengerAge;
	private BigInteger passengerUIN;
	private double luggage;
	@ElementCollection
	private List<BigInteger> passengerList = new ArrayList<>();

	public PassengerDto() {
		super();
	}
	
	public PassengerDto(String passengerName, Integer passengerAge, BigInteger passengerUIN, double luggage,
			List<BigInteger> passengerList) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
		this.passengerList = passengerList;
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

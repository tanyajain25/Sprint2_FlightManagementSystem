package org.cap.passengermngt.service;

import java.math.BigInteger;
import java.util.List;

import org.cap.passengermngt.entities.Passenger;


public interface PassengerService {

	Passenger addPassenger(Passenger passenger);

	Passenger viewPassenger(BigInteger pnrNo);


   
}

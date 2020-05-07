package org.cap.passengermngt.controller;

import org.cap.passengermngt.dto.PassengerDto;
import org.cap.passengermngt.entities.Passenger;
import org.cap.passengermngt.exceptions.PassengerNotFoundException;
import org.cap.passengermngt.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerRestController {

	private static final Logger Log = LoggerFactory.getLogger(PassengerRestController.class);

	@Autowired
	private PassengerService service;

	@PostMapping("/add")
	public ResponseEntity<Passenger> addPassenger(@RequestBody PassengerDto dto) {
		Passenger passenger = convertFromDto(dto);
		passenger = service.addPassenger(passenger);
		ResponseEntity<Passenger> reponse = new ResponseEntity<Passenger>(passenger, HttpStatus.OK);
		return reponse;
	}

	public Passenger convertFromDto(PassengerDto dto) {
		Passenger passenger = new Passenger();
		passenger.setPassengerName(dto.getPassengerName());
		passenger.setPassengerAge(dto.getPassengerAge());
		passenger.setPassengerUIN(dto.getPassengerUIN());
		passenger.setLuggage(dto.getLuggage());
		passenger.setPassengerList(dto.getPassengerList());
		return passenger;
	}

	@GetMapping("/getbypnrno/{pnrNo}")
	public ResponseEntity<Passenger> findByUserId(@PathVariable("pnrNo") BigInteger pnrNo) {
		Passenger passenger = service.viewPassenger(pnrNo);
		ResponseEntity<Passenger> reponse = new ResponseEntity<Passenger>(passenger, HttpStatus.OK);
		return reponse;
	}

	@ExceptionHandler(PassengerNotFoundException.class)
	public ResponseEntity<String> handleUserNotFound(PassengerNotFoundException exception) {
		Log.error("Passenger Not Found Exception", exception);
		String message = exception.getMessage();
		ResponseEntity<String> response = new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
		return response;
	}
//
//	@GetMapping("/getall")
//	public ResponseEntity<List<User>> fetchAllUsers() {
//		List<User> listOfUsers = service.viewAllUsers();
//		ResponseEntity<List<User>> reponse = new ResponseEntity<List<User>>(listOfUsers, HttpStatus.OK);
//		return reponse;
//	}
//
//	@DeleteMapping("/deletebyuserid/{userId}")
//	public ResponseEntity<String> deleteUser(@PathVariable("userId") BigInteger userId) {
//		service.deleteUser(userId);
//		String message = "Deleted";
//		ResponseEntity<String> reponse = new ResponseEntity<String>(message, HttpStatus.OK);
//		return reponse;
//	}
//
//	@PutMapping("/update")
//	public ResponseEntity<User> updateUser(@RequestBody UserDto dto) {
//		User user = convertFromDto(dto);
//	    user = service.updateUser(user);
//		ResponseEntity<User> response = new ResponseEntity<>(user, HttpStatus.OK);
//		return response;
//	}
	
}

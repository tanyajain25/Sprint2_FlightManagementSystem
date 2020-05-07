package org.cap.passengermngt.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.cap.passengermngt.dao.PassengerDao;
import org.cap.passengermngt.entities.Passenger;
import org.cap.passengermngt.exceptions.PassengerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PassengerServiceImpl implements PassengerService {

	private PassengerDao passengerDao;

	
	public PassengerDao getPassengerDao() {
		return passengerDao;
	}
	@Autowired
	public void setPassengerDao(PassengerDao passengerDao) {
		this.passengerDao = passengerDao;
	}

	/*
	 * addUser(User):User :- Adds a new user. viewUser(BigInteger):User :- Shows the
	 * details of a user identifiable by the user id. viewUser(): List<User> :-
	 * Shows the details of all users. updateUser(User):User :- Updates the details
	 * of a user. deleteUser(BigInteger):void Removes a user as per the user id.
	 * validateUser(User): void :- Validates the attributes of a user.
	 */
	@Override
	public Passenger addPassenger(Passenger passenger) {
		passenger = passengerDao.save(passenger);
		return passenger;
	}

	@Override
	public Passenger viewPassenger(BigInteger pnrNo) {
		Optional<Passenger> optional = passengerDao.findById(pnrNo);
		if (optional.isPresent()) {
			Passenger passenger = optional.get();
			return passenger;
		}
		throw new PassengerNotFoundException("Passengers not found for pnrNo=" + pnrNo);
	}
//
//	@Override
//	public List<Passenger> viewAllUsers() {
//		List<User> list = userDao.findAll();
//		return list;
//	}
//
//	@Override
//	public void deletePAssenger(BigInteger pnrNo) {
//		userDao.deleteById(userId);
//	}
//	
//	@Override
//	public User updateUser(User user) {
//		user = userDao.save(user);
//		return user;
//	}


}

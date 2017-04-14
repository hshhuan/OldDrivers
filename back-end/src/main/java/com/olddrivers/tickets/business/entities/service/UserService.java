package com.olddrivers.tickets.business.entities.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olddrivers.tickets.business.entities.FailedError;
import com.olddrivers.tickets.business.entities.Status;
import com.olddrivers.tickets.business.entities.User;
import com.olddrivers.tickets.business.entities.repositories.UserRepository;
import com.olddrivers.tickets.util.LoginForm;
import com.olddrivers.tickets.util.Message;;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public UserService() {
		super();
	}

	// API
	
	public User findOne(final Long id) {
		return userRepo.findOne(id);
	}

	public User findByName(final String name) {
		return userRepo.findByName(name);
	}

	public User findByNameAndPassword(final String name, final String password) {
		return userRepo.findByNameAndPassword(name, password);
	}

	public User findByPhone(final String phone) {
		return userRepo.findByName(phone);
	}

	public User findByEmail(final String email) {
		return userRepo.findByName(email);
	}

	public List<User> findAll() {
		return (ArrayList<User>) userRepo.findAll();
	}

	public Message Login(LoginForm loginForm) {
		ArrayList<FailedError> errorList = new ArrayList<FailedError>();
		if (findByName(loginForm.getData1()) == null) {
			errorList.add(FailedError.USER_NOT_EXISTED);
		} else {
			User data = findByNameAndPassword(loginForm.getData1(), loginForm.getData2());
			if (data == null) {
				errorList.add(FailedError.PASSWORD_ERROR);
			} else {
				return new Message(Status.SUCCEED, errorList, data);
			}
		}
		return new Message(Status.FAILED, errorList, new User());
	}

	public Message Add(User data) {
		ArrayList<FailedError> errorList = new ArrayList<FailedError>();
		if (findByName(data.getName()) != null) {
			errorList.add(FailedError.NAME_EXISTED);
		}
		else if (findByPhone(data.getPhone()) != null) {
			errorList.add(FailedError.PHONE_EXISTED);
		}
		else if (findByEmail(data.getEmail()) != null) {
			errorList.add(FailedError.EMAIL_EXISTED);
		} else {
			return new Message(Status.SUCCEED, errorList, userRepo.save(data));
		}
		return new Message(Status.FAILED, errorList, new User());
	}

	public Message Update(User user) {
		
		//Method CrudRepository.save() can do both create and update
		return Add(user);
	}

}

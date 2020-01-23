package com.sa.core.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.core.entity.*;
import com.sa.core.repository.*;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUser() {
		return repository.findAll();
	}
	
	private boolean checkUsernameAvailable(User user) throws Exception {
		Optional<User> userFound = repository.findByUsername(user.getUsername());
		if(userFound.isPresent()) {
			throw new Exception("Username no disponible");
		}
		return true;
	}
	private boolean checkPasswordValid(User user) throws Exception {
		Optional<User> userFound = repository.findByUsername(user.getUsername());
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			throw new Exception("Los passwords NO son iguales");
		}
		return true;
	}

	@Override
	public User createUser(User user) throws Exception {
		if(checkUsernameAvailable(user) && checkPasswordValid(user)) {
			user = repository.save(user);
		}
		return null;
	}
	
	
	
	
	
	
	
}

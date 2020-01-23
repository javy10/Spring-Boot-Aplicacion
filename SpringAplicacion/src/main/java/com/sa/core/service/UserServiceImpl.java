package com.sa.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.core.entity.User;
import com.sa.core.repository.*;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUser() {
		return repository.findAll();
	}
	
	
	
}

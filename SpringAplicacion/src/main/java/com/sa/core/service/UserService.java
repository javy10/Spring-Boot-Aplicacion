package com.sa.core.service;

import javax.validation.Valid;

import com.sa.core.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUser();

	public User createUser(User user) throws Exception;
}

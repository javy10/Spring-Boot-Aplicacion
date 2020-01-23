package com.sa.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sa.core.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	//public Iterable<User> findByStatus(String status);
}

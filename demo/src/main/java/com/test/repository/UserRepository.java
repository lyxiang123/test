package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entry.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);
}

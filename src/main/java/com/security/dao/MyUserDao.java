package com.security.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.model.User;

public interface MyUserDao extends JpaRepository<User, Integer>{
	
	Optional<User> findByUserName(String userName);

}

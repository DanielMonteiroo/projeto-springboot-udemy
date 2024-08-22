package com.danielmonteiro.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danielmonteiro.springboot.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
	
}

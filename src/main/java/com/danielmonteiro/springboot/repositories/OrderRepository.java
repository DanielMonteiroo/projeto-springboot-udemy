package com.danielmonteiro.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielmonteiro.springboot.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}

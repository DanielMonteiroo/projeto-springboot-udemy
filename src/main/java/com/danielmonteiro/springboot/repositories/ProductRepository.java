package com.danielmonteiro.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielmonteiro.springboot.entities.Category;
import com.danielmonteiro.springboot.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}

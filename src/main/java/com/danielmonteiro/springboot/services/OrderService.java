package com.danielmonteiro.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielmonteiro.springboot.entities.Order;
import com.danielmonteiro.springboot.entities.User;
import com.danielmonteiro.springboot.repositories.OrderRepository;
import com.danielmonteiro.springboot.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	//Metodo para retornar todos os pedidos
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//Metodo de busca por ID
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}

package com.danielmonteiro.springboot.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.danielmonteiro.springboot.entities.Product;
import com.danielmonteiro.springboot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//Metodo para retornar todos os usuários
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	//Metodo de busca por ID
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}

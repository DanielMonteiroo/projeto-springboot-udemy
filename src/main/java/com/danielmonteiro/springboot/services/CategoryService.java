package com.danielmonteiro.springboot.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.danielmonteiro.springboot.entities.Category;
import com.danielmonteiro.springboot.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//Metodo para retornar todos os pedidos
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	//Metodo de busca por ID
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}

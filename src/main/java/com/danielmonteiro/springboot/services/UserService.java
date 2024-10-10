package com.danielmonteiro.springboot.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.danielmonteiro.springboot.entities.User;
import com.danielmonteiro.springboot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//Metodo para retornar todos os usuários
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//Metodo de busca por ID
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//Metodo inserir usuário
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//Metodo deletar usuário
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	//Metodo atualizar usuário
		public User update(Long id,User obj) {
			User entity = repository.getReferenceById(id);
			updateData(entity,obj);
			return repository.save(entity);
		}

	private void updateData(User entity, User obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}//fim atualizar usuário
	
} 

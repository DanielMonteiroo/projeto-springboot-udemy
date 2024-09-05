package com.danielmonteiro.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danielmonteiro.springboot.entities.OrderItem;
import com.danielmonteiro.springboot.entities.pk.OrdemItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPK> {
	
}

package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.GroceryType;

public interface GroceryTypeRepo extends JpaRepository<GroceryType, Integer> {
	
//	List<GroceryType> findByIceCreamToppingsName(String toppingName);
}

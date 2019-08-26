package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.GroceryList;

public interface GroceryListRepo extends JpaRepository<GroceryList, Integer> {
	GroceryList findByName(String name);
//	
//	List<GroceryList> findByRoleOrderByUsername(String role);
}

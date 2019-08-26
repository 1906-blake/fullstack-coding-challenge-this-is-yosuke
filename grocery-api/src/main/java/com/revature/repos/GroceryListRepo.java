package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.GroceryList;

public interface GroceryListRepo extends JpaRepository<GroceryList, Integer> {
	GroceryList findByName(String name);
	
//	GroceryList findByUsernameAndPassword(String username, String password);
//	
//	List<GroceryList> findByRoleOrderByUsername(String role);
	
//	@Query("FROM User u WHERE u.role = :role")
//	List<User> findByRoleHql(String role);
	
	
}

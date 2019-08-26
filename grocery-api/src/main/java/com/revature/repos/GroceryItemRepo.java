package com.revature.repos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.GroceryItem;

public interface GroceryItemRepo extends JpaRepository<GroceryItem, Integer> {
	
	Page<GroceryItem> findByTypeName(String brandName, Pageable page);

//	List<GroceryItem> findByName(String name);

}

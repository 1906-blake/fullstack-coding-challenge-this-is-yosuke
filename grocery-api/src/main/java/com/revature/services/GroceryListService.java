package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.GroceryList;
import com.revature.repos.GroceryListRepo;

@Service
public class GroceryListService {
	
	@Autowired
	private GroceryListRepo glr;
	
	public List<GroceryList> findAll() {
		return glr.findAll();
	}


//	public List<Brand> findByIceCreamToppingsName(String toppingName) {
//		return br.findByIceCreamToppingsName(toppingName);
//	}
}

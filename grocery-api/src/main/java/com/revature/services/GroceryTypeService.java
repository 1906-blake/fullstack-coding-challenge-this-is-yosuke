package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.GroceryType;
import com.revature.repos.GroceryTypeRepo;

@Service
public class GroceryTypeService {
	
	@Autowired
	private GroceryTypeRepo gtr;

//	public List<G> findByIceCreamToppingsName(String toppingName) {
//		return br.findByIceCreamToppingsName(toppingName);
//	}
}

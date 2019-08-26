package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.GroceryType;
import com.revature.services.GroceryTypeService;

@RestController
@RequestMapping("/types")
public class GroceryTypeController {
	@Autowired
	private GroceryTypeService gts;

//	@GetMapping("/icecream/toppings/name/{toppingName}")
//	public List<Brand> findBrandsContainingTopping(@PathVariable String toppingName) {
//		return brandService.findByIceCreamToppingsName(toppingName);
//  }
	
//	@GetMapping("/icecream/toppings/name/{toppingName}")
//	public List<GroceryType> findBrandsContainingTopping(@PathVariable String toppingName) {
//		return gts.findByIceCreamToppingsName(toppingName);
//  helllloooo}
	
}

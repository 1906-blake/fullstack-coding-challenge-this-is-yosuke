package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.GroceryList;
import com.revature.services.GroceryListService;

@RestController
@RequestMapping("/lists")
public class GroceryListController {
	
	@Autowired
	private GroceryListService gls;
	
	@GetMapping
	public List<GroceryList> findAll() {
		return gls.findAll();
	}
	
	
}
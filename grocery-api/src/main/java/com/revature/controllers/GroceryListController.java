package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Flavor;
import com.revature.models.GroceryList;
import com.revature.models.IceCream;
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
	
	@PostMapping("{groceryListId}/lists")
	public ResponseEntity<GroceryList> addGroceryList(@PathVariable int groceryListId) {
		GroceryList updatedGroceryList = groceryListService;
		ResponseEntity<GroceryList> resp = new ResponseEntity<GroceryList>(updatedGroceryList, HttpStatus.CREATED);
		return resp;
	}
	
	
}
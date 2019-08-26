package com.revature.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.revature.models.GroceryType;
import com.revature.repos.GroceryItemRepo;
import com.revature.models.GroceryItem;
import com.revature.models.GroceryList;
import com.revature.services.GroceryItemService;

public class GroceryItemService {
	
	@Autowired
	private GroceryItemRepo gir;

	public Page<GroceryItem> findAll(int pageNumber) {
		Pageable page = PageRequest.of(pageNumber, 5);
		return gir.findAll(page);
	}

	public Page<GroceryItem> findByTypeName(String typeName, int pageNumber) {
		Pageable page = PageRequest.of(pageNumber, 5);
		return gir.findByTypeName(typeName, page);
	}

//	public List<GroceryItem> findByFlavorsName(String flavorName) {
//		return gir.findByFlavorsName(flavorName);
//	}

	@Transactional
	public GroceryItem addItemToList(int groceryItemId, GroceryItem gitem) {
		GroceryItem gl = gir.getOne(groceryItemId);
		gl.getItems().add(gitem);
		return gl;
	}

	public GroceryItem update(GroceryItem gi) {
		return gir.saveAndFlush(gi);
	}
}

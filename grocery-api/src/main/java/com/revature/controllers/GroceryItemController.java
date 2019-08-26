package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.revature.aop.Auth;
import com.revature.models.GroceryType;
import com.revature.models.GroceryItem;
import com.revature.services.GroceryItemService;

@RestController
@RequestMapping("groceryItem")
public class GroceryItemController {
	
	@Autowired
	private GroceryItemService gis;

	@GetMapping
	public Page<GroceryItem> findAll(@RequestParam int page) {
		System.out.println(page);
		return gis.findAll(page);
	}

//	@GetMapping("/brand/name/{brandName}")
//	public Page<IceCream> findByBrandName(@PathVariable String brandName, @RequestParam int page) {
//		return iceCreamService.findByBrandName(brandName, page);
//	}

//	@GetMapping("/flavors/name/{flavorName}")
//	public List<IceCream> findByFlavorsName(@PathVariable String flavorName) {
//		return iceCreamService.findByFlavorsName(flavorName);
//	}

//	@PostMapping("{iceCreamId}/flavors")
//	public ResponseEntity<IceCream> addFlavorToIceCream(@PathVariable int iceCreamId, @RequestBody Flavor flav) {
//		IceCream updatedIceCream = iceCreamService.addFlavorToIceCream(iceCreamId, flav);
//		ResponseEntity<IceCream> resp = new ResponseEntity<IceCream>(updatedIceCream, HttpStatus.CREATED);
//		return resp;
//	}
	
	@PostMapping("{groceryItemId}/groceryItem")
	public ResponseEntity<GroceryItem> addFlavorToIceCream(@PathVariable int groceryItemId, @RequestBody GroceryItem gitem) {
		GroceryItem updatedList = gis.addItemToList(groceryItemId, gitem);
		ResponseEntity<GroceryItem> resp = new ResponseEntity<GroceryItem>(updatedList, HttpStatus.CREATED);
		return resp;
	}

//	@PutMapping
//	public IceCream update(@RequestBody IceCream ic) {
//		return iceCreamService.update(ic);
//	}
}


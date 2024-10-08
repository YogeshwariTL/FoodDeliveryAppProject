package com.Delivery.DeliveryApp.FoodDelivery.Restuarant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestuarantController {

	@Autowired
	private RestuarantService restaurant_service;

	@PostMapping("/save/restuarant")
	public Restaurants saveRestuarantDetails(@RequestBody RestaurantDTO restuarantdto) {
		return restaurant_service.saveRestuarantDetails(restuarantdto);
	}

	@GetMapping("get/restuarants")
	public List<Restaurants> getAllRestuarants() {
		return restaurant_service.getAllRestuarants();
	}

	//API to make Restaurant inactive or offline
	@PutMapping("Restuarant/{restuarent_id}")
	public Restaurants makeRestarantInActive(@PathVariable("restuarent_id") int restaurent_id) {
		return restaurant_service.makeRestarantInActive(restaurent_id);
	}

	//to get active restaurants only
	@GetMapping("get/activeRestaurants")
	public List<Restaurants> getAllActiveRestaurants(){
		return restaurant_service.getAllActiveRestaurants();
	}

	//get restaurants by using pagination concept	 
	@GetMapping("get/resto/paginaton") 
	public Page<Restaurants> getPaginatedRestaurants(@RequestParam int pageNumber , @RequestParam int pageSize){
		return restaurant_service.getPaginatedRestaurants(pageNumber,pageSize);

	}
}

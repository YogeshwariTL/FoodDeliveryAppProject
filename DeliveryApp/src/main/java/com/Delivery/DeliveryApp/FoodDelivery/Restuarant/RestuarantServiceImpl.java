package com.Delivery.DeliveryApp.FoodDelivery.Restuarant;

import java.time.LocalTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class RestuarantServiceImpl implements RestuarantService {
	
	ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	RestuarantRepository restuarant_repo;

	@Override
	public List<Restaurants> getAllRestuarants() {
		return  restuarant_repo.findAll();
	}

	@Override
	public Restaurants saveRestuarantDetails(RestaurantDTO restuarantdto) {
		Restaurants entityObject=modelMapper.map(restuarantdto,Restaurants.class);
		return restuarant_repo.save(entityObject);
	}

	@Override
	public Restaurants makeRestarantInActive(int restuarent_id) {
		LocalTime currentTime=LocalTime.now();
		Restaurants restaurant= restuarant_repo.findById(restuarent_id).orElseThrow(()-> new RuntimeException("Restaurant not found"));
		boolean is_restaurant_active=(!(currentTime.isAfter(restaurant.getRestaurant_closingTime())))&&(!(currentTime.isBefore(restaurant.getRestaurant_openingTime())));
		restaurant.setIs_Restaurant_active(is_restaurant_active);
		  return restuarant_repo.save(restaurant);
		
	}
	@Override
	public List<Restaurants> getAllActiveRestaurants() {		
		return restuarant_repo.findAllActiveRestaurants();
	}

	@Override
	public Page<Restaurants> getPaginatedRestaurants(int pageNo,int size) {
		return restuarant_repo.findAll(PageRequest.of(pageNo, size));
	}

	@Override
	public List<Restaurants> getResturantBasedOnFoodType(FoodType foodtype) {
		if(foodtype==FoodType.ALL) {
			return restuarant_repo.findAll();
		}
		else {
		return restuarant_repo.findRestuarantsByfoodtype(foodtype);	
	}
	
	}
}

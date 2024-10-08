package com.Delivery.DeliveryApp.FoodDelivery.Restuarant;

import java.util.List;

import org.springframework.data.domain.Page;

public interface RestuarantService {

	List<Restaurants> getAllRestuarants();

	Restaurants saveRestuarantDetails(RestaurantDTO restuarantdto);

	Restaurants makeRestarantInActive(int restaurent_id);

	List<Restaurants> getAllActiveRestaurants();

	Page<Restaurants> getPaginatedRestaurants(int page,int size);

	List<Restaurants> getResturantBasedOnFoodType(FoodType foodtype);

}

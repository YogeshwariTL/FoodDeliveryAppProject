package com.Delivery.DeliveryApp.FoodDelivery.Restuarant;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RestuarantRepository extends JpaRepository<Restaurants,Integer> {
    
	@Query("SELECT r FROM Restaurants r WHERE r.is_Restaurant_active = true")
	List<Restaurants> findAllActiveRestaurants();

	Page<Restaurants> findAll(Pageable pageable);

	List<Restaurants> findRestuarantsByfoodtype(FoodType foodtype);

	

	
}

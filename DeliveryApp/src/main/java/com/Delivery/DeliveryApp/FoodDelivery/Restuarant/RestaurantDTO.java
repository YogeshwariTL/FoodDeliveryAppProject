package com.Delivery.DeliveryApp.FoodDelivery.Restuarant;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import com.Delivery.DeliveryApp.FoodDelivery.Item;



public class RestaurantDTO {

	private String restuarant_name;

	private String restuarant_location;	  

	private String restuarant_ratings;	  

	private Boolean is_Restaurant_active;	  

	private Date registered_date; 

	private LocalTime restaurant_openingTime;

	private LocalTime restaurant_closingTime; 
	
	private FoodType foodtype;
	
	 private List<Item> items;

	public FoodType getFoodtype() {
		return foodtype;
	}

	public void setFoodtype(FoodType foodtype) {
		this.foodtype = foodtype;
	}


	public String getRestuarant_name() {
		return restuarant_name;
	}

	public void setRestuarant_name(String restuarant_name) {
		this.restuarant_name = restuarant_name;
	}

	public String getRestuarant_location() {
		return restuarant_location;
	}

	public void setRestuarant_location(String restuarant_location) {
		this.restuarant_location = restuarant_location;
	}

	public String getRestuarant_ratings() {
		return restuarant_ratings;
	}

	public void setRestuarant_ratings(String restuarant_ratings) {
		this.restuarant_ratings = restuarant_ratings;
	}

	public boolean isIs_Restaurant_active() {
		return is_Restaurant_active;
	}

	public void setIs_Restaurant_active(boolean is_Restaurant_active) {
		this.is_Restaurant_active = is_Restaurant_active;
	}

	public Date getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public LocalTime getRestaurant_openingTime() {
		return restaurant_openingTime;
	}

	public void setRestaurant_openingTime(LocalTime restaurant_openingTime) {
		this.restaurant_openingTime = restaurant_openingTime;
	}

	public LocalTime getRestaurant_closingTime() {
		return restaurant_closingTime;
	}

	public void setRestaurant_closingTime(LocalTime restaurant_closingTime) {
		this.restaurant_closingTime = restaurant_closingTime;
	}


}

package com.Delivery.DeliveryApp.FoodDelivery.Restuarant;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import com.Delivery.DeliveryApp.FoodDelivery.Item;
import com.Delivery.DeliveryApp.FoodDelivery.Order.Orders;

import jakarta.persistence.*;

@Entity
@Table(name="Restaurants")
public class Restaurants {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Restuarent_id")
	private int restuarent_id;

	@Column(name="restuarant_name")
	private String restuarant_name;

	@Column(name="Resturant_Location")
	private String restuarant_location;

	@Column(name="Restuarant_Ratings")
	private int restuarant_ratings;

	@Column(name="Is_Restuarant_active")
	private boolean is_Restaurant_active;

	@Column(name="Registered_date")
	private Date registered_date;

	@Column(name="OpeningTime")
	private LocalTime restaurant_openingTime;
	
	@Column(name="ClosingTime")
	private LocalTime restaurant_closingTime; 
	
	@Enumerated(EnumType.STRING)
	private FoodType foodtype;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="restuarent_id")
	private List<Item> items;
	
	@OneToMany(mappedBy = "restaurants" , cascade = CascadeType.ALL)
	private List<Orders> orders;
	
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


	public int getRestuarent_id() {
		return restuarent_id;
	}

	public void setRestuarent_id(int restuarent_id) {
		this.restuarent_id = restuarent_id;
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

	public Date getRegistered_date() {
		return registered_date;
	}

	public void setRegistered_date(Date registered_date) {
		this.registered_date = registered_date;
	}

	public int getRestuarant_ratings() {
		return restuarant_ratings;
	}

	public void setRestuarant_ratings(int restuarant_ratings) {
		this.restuarant_ratings = restuarant_ratings;
	}

	public boolean isIs_Restaurant_active() {
		return is_Restaurant_active;
	}

	public void setIs_Restaurant_active(boolean is_Restaurant_active) {
		this.is_Restaurant_active = is_Restaurant_active;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	
}

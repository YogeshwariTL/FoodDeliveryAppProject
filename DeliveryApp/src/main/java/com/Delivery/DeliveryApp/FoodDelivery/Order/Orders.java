package com.Delivery.DeliveryApp.FoodDelivery.Order;

import java.time.LocalDateTime;
import java.util.List;

import com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent.Delivery_Agent;
import com.Delivery.DeliveryApp.FoodDelivery.Restuarant.Restaurants;
import com.Delivery.DeliveryApp.FoodDelivery.User.Users;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity

public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;

	private String orderStatus;

	private LocalDateTime orderPlacedTime;

	private LocalDateTime deliveredTime;

	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;

	@ManyToOne
	@JoinColumn(name="delivery_agent_id")
	private Delivery_Agent deliveryAgent;

	@ManyToOne
	@JoinColumn(name="restuarent_id")
	private Restaurants restaurants;

	@OneToMany(mappedBy="order",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<OrderedItem> orderItem;

	public List<OrderedItem> getOrderdItem() {
		return orderItem;
	}



	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}


	public Delivery_Agent getDeliveryAgent() {
		return deliveryAgent;
	}


	public void setDeliveryAgent(Delivery_Agent deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}


	public Restaurants getRestaurants() {
		return restaurants;
	}


	public void setRestaurants(Restaurants restaurants) {
		this.restaurants = restaurants;
	}



	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public LocalDateTime getOrderPlacedTime() {
		return orderPlacedTime;
	}


	public void setOrderPlacedTime(LocalDateTime orderPlacedTime) {
		this.orderPlacedTime = orderPlacedTime;
	}


	public LocalDateTime getDeliveredTime() {
		return deliveredTime;
	}


	public void setDeliveredTime(LocalDateTime deliveredTime) {
		this.deliveredTime = deliveredTime;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}



	public List<OrderedItem> getOrderItem() {
		return orderItem;
	}



	public void setOrderItem(List<OrderedItem> orderItem) {
		this.orderItem = orderItem;
	}




}

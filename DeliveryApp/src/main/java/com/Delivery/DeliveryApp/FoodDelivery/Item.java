package com.Delivery.DeliveryApp.FoodDelivery;


import com.Delivery.DeliveryApp.FoodDelivery.Order.Orders;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_id;
	
    private String item_name;
	
	private double item_price;
	
	private int itemQuantiy;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders order;
	
	public int getItemQuantiy() {
		return itemQuantiy;
	}

	public void setItemQuantiy(int itemQuantiy) {
		this.itemQuantiy = itemQuantiy;
	}


	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}
	



}

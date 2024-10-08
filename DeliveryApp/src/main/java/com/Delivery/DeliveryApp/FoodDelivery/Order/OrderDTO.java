package com.Delivery.DeliveryApp.FoodDelivery.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class OrderDTO {
    private int orderId;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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

	public List<OrderedItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(List<OrderedItem> orderItem) {
		this.orderItem = orderItem;
	}

	private String orderStatus;
	
	private LocalDateTime orderPlacedTime;
	
	private LocalDateTime deliveredTime;
	
	private List<OrderedItem> orderItem=new  ArrayList<OrderedItem>();
	

}

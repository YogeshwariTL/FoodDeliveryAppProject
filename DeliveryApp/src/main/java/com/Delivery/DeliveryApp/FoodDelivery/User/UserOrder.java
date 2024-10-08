package com.Delivery.DeliveryApp.FoodDelivery.User;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="UserOrders")
public class UserOrder {
	
	@Id
	private  int userOrder_id;
	
	private Date orderDate;
	
	private String orderStatus;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Users user;

	public int getUserOrder_id() {
		return userOrder_id;
	}

	public void setUserOrder_id(int userOrder_id) {
		this.userOrder_id = userOrder_id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	

}

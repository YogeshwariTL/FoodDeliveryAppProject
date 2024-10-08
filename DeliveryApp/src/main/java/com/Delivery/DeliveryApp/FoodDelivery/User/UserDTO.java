package com.Delivery.DeliveryApp.FoodDelivery.User;

import java.sql.Date;
import java.util.List;

import com.Delivery.DeliveryApp.FoodDelivery.Order.Orders;

public class UserDTO {
	
	private  String user_name;
	
	private char user_gender;
	
	private String User_location;
	

	private String user_phoneNumber;
	
	private String user_email;
	
	private int user_ratings;
	
	private  Date user_registered_date;
	
	
	private  Date user_last_login_date;
	
	
	private List<UserOrder> userOrders;
	
	private List<Orders> order;
	
	
    public char getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(char user_gender) {
		this.user_gender = user_gender;
	}

	public String getUser_location() {
		return User_location;
	}

	public void setUser_location(String user_location) {
		User_location = user_location;
	}

	public String getUser_phoneNumber() {
		return user_phoneNumber;
	}

	public void setUser_phoneNumber(String user_phoneNumber) {
		this.user_phoneNumber = user_phoneNumber;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getUser_ratings() {
		return user_ratings;
	}

	public void setUser_ratings(int user_ratings) {
		this.user_ratings = user_ratings;
	}

	public Date getUser_registered_date() {
		return user_registered_date;
	}

	public void setUser_registered_date(Date user_registered_date) {
		this.user_registered_date = user_registered_date;
	}

	public Date getUser_last_login_date() {
		return user_last_login_date;
	}

	public void setUser_last_login_date(Date user_last_login_date) {
		this.user_last_login_date = user_last_login_date;
	}

	public List<UserOrder> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(List<UserOrder> userOrders) {
		this.userOrders = userOrders;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	

}

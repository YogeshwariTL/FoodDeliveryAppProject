package com.Delivery.DeliveryApp.FoodDelivery.User;

import java.sql.Date;
import java.util.List;

import com.Delivery.DeliveryApp.FoodDelivery.Order.Orders;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User-Id")
	private int user_id;
	
	@Column(name="User_Name")
	private String user_name;
	
	@Column(name="User_Gender")
	private char user_gender;
		
	@Column(name="User_location")
	private String User_location;
	
	@Column(name="User_phoneNumber")
	private String user_phoneNumber;
	
	@Column(name="User_email")
	private String user_email;
	
	@Column(name="User_ratings")
	private int user_ratings;
	
	@Column(name="User_registered_date")
	private  Date user_registered_date;
	
	@Column(name="last_login_date")
	private  Date user_last_login_date;
	
	@OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
	private List<UserOrder> userOrders;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Orders> order;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

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
	
	
}

package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

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
@Table(name="Delivery_Agent")
public class Delivery_Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Delivery_agent_Id")
	private int delivery_agent_id;

	@Column(name="delivery_agent_name")
	private String delivery_agent_name;
	
	@Column(name="delivery_agent_ph")
	private String delivery_agent_ph;
	
	@Column(name="Agent_Email")
	private String agent_Email;
	
	@Column(name="Agent_ratings")
	private int Agent_ratings;
	
	@Column(name="Agent_gender")
	private char agent_gender;
	
	@Column(name="Agent_is_active")
	private Boolean isAgentActive;
	
	@Column(name="Agent_location")
	private String agent_location;
	
	@Column(name="number_of_order")
	private int number_of_order;
	
	private Boolean isFree;	

	public Boolean getIsFree() {
		return isFree;
	}

	public void setIsFree(Boolean isFree) {
		this.isFree = isFree;
	}

	@OneToMany(mappedBy = "deliveryAgent",cascade = CascadeType.ALL)
	private List<DeliveryAgentOrders> deliveryAgentOrders;
	
	@OneToMany(mappedBy = "deliveryAgent",cascade = CascadeType.ALL)
	private List<Orders> orders;


	public int getDelivery_agent_id() {
		return delivery_agent_id;
	}

	public void setDelivery_agent_id(int delivery_agent_id) {
		this.delivery_agent_id = delivery_agent_id;
	}

	public String getDelivery_agent_name() {
		return delivery_agent_name;
	}

	public void setDelivery_agent_name(String delivery_agent_name) {
		this.delivery_agent_name = delivery_agent_name;
	}

	public String getDelivery_agent_ph() {
		return delivery_agent_ph;
	}

	public void setDelivery_agent_ph(String delivery_agent_ph) {
		this.delivery_agent_ph = delivery_agent_ph;
	}

	public String getAgent_Email() {
		return agent_Email;
	}

	public void setAgent_Email(String agent_Email) {
		this.agent_Email = agent_Email;
	}

	public int getAgent_ratings() {
		return Agent_ratings;
	}

	public void setAgent_ratings(int agent_ratings) {
		Agent_ratings = agent_ratings;
	}

	public char getAgent_gender() {
		return agent_gender;
	}

	public void setAgent_gender(char agent_gender) {
		this.agent_gender = agent_gender;
	}

	public Boolean getAgent_is_active() {
		return isAgentActive;
	}

	public void setAgent_is_active(Boolean agent_is_active) {
		this.isAgentActive = agent_is_active;
	}

	public String getAgent_location() {
		return agent_location;
	}

	public void setAgent_location(String agent_location) {
		this.agent_location = agent_location;
	}

	public int getNumber_of_order() {
		return number_of_order;
	}

	public void setNumber_of_order(int number_of_order) {
		this.number_of_order = number_of_order;
	}
	
	
}

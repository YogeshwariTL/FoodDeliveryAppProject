package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

import java.util.List;

import com.Delivery.DeliveryApp.FoodDelivery.Order.Orders;

public class DeliveryAgentDTO {
	
	private String delivery_agent_name;
	
	private String delivery_agent_ph;
	
	private String agent_Email;
		
	private int Agent_ratings;	
	
	private char agent_gender;
	
	private Boolean isAgentActive;
	
	private String agent_location;
	
	private Boolean isFree;
	
	private List<DeliveryAgentOrders> deliveryAgentOrders;
	
	private List<Orders> orders;
	
	
	public List<DeliveryAgentOrders> getDeliveryAgentOrders() {
		return deliveryAgentOrders;
	}


	public void setDeliveryAgentOrders(List<DeliveryAgentOrders> deliveryAgentOrders) {
		this.deliveryAgentOrders = deliveryAgentOrders;
	}


	public List<Orders> getOrders() {
		return orders;
	}


	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}


	public Boolean getIsAgentActive() {
		return isAgentActive;
	}


	public void setIsAgentActive(Boolean isAgentActive) {
		this.isAgentActive = isAgentActive;
	}


	public Boolean getIsFree() {
		return isFree;
	}


	public void setIsFree(Boolean isFree) {
		this.isFree = isFree;
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


	public void setAgent_is_active(Boolean isAgentActive) {
		this.isAgentActive = isAgentActive;
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


	private int number_of_order;


}

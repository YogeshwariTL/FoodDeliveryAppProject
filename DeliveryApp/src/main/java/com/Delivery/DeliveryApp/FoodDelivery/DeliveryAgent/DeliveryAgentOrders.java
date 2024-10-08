package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="DeliveryAgentOrders")
public class DeliveryAgentOrders {
	@Id
	private  int deliveryAgentOrder_id;
	
	private Date orderDate;
	
	private LocalTime ordered_time;
	
	@ManyToOne
	@JoinColumn(name="delivery_agent_id")
	private Delivery_Agent deliveryAgent;
		

	public int getDeliveryAgentOrder_id() {
		return deliveryAgentOrder_id;
	}

	public void setDeliveryAgentOrder_id(int deliveryAgentOrder_id) {
		this.deliveryAgentOrder_id = deliveryAgentOrder_id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public LocalTime getOrdered_time() {
		return ordered_time;
	}

	public void setOrdered_time(LocalTime ordered_time) {
		this.ordered_time = ordered_time;
	}
	

}

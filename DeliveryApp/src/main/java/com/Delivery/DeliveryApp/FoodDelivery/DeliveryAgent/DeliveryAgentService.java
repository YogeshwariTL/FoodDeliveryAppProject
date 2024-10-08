package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

import java.util.List;


public interface DeliveryAgentService {

	List<Delivery_Agent> getAllDeliveryAgents();

	Delivery_Agent saveDeliveryAgentDetails(DeliveryAgentDTO deliveryAgentDto);

	String assignAgentToOrder(int order_id);
}
	

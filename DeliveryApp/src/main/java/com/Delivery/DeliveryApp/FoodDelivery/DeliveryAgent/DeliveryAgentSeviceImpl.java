package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Delivery.DeliveryApp.FoodDelivery.Order.OrderRepository;
import com.Delivery.DeliveryApp.FoodDelivery.Order.Orders;

@Service
public class DeliveryAgentSeviceImpl implements DeliveryAgentService {

	@Autowired
	Delivery_Agent_Repository deliveryAgent_repo;
	
	@Autowired
	OrderRepository order_repo;
	
	ModelMapper mapper=new ModelMapper();
	
	@Override
	public List<Delivery_Agent> getAllDeliveryAgents() {
		return deliveryAgent_repo.findAll();
	}

	@Override
	public Delivery_Agent saveDeliveryAgentDetails(DeliveryAgentDTO deliveryAgentDto) {
		Delivery_Agent deliveryAgent =mapper.map(deliveryAgentDto,Delivery_Agent.class);
		return deliveryAgent_repo.save(deliveryAgent);				
	}

	@Override
	public String assignAgentToOrder(int order_id) {
	List<Delivery_Agent> availableAgents=deliveryAgent_repo.findByIsAgentActiveAndIsFree(true, true);
	
	if(availableAgents.isEmpty()) {
        throw new RuntimeException("No delivery agent is available right now.");
	}
	 Delivery_Agent assignedAgent = availableAgents.get(0);
     assignedAgent.setIsFree(false);
     
     Orders order = order_repo.findById(order_id) .orElseThrow(() -> new RuntimeException("Order not found"));
     
     order.setDeliveryAgent(assignedAgent);
     
     deliveryAgent_repo.save(assignedAgent);
     order_repo.save(order);
     
     return "Agent " + assignedAgent.getDelivery_agent_name() + " has been assigned to order " +order_id ;
    }
}
     
	

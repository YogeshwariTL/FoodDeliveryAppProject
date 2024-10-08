package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DeliveryAgentController {
	@Autowired
	 private DeliveryAgentService deliveryagent_service;
	
	@PostMapping("/save/deliveryAgent")
	public Delivery_Agent  saveDeliveryAgentDetails(@RequestBody DeliveryAgentDTO delivery_agent) {
		return deliveryagent_service.saveDeliveryAgentDetails(delivery_agent);
	}

	@GetMapping("get/deliveryAgents")
	public List<Delivery_Agent> getAllDeliveryAgents() {
		return deliveryagent_service.getAllDeliveryAgents();
	}
	@PutMapping("assignAgent")
	public ResponseEntity<String> assignAgentToOrder(@RequestParam int order_id) {
		String result= deliveryagent_service.assignAgentToOrder(order_id);
		return  ResponseEntity.ok(result);
	}

}

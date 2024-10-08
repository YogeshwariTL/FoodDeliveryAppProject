package com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Delivery_Agent_Repository extends JpaRepository<Delivery_Agent, Integer> {

	List<Delivery_Agent> findByIsAgentActiveAndIsFree(boolean isAgentActive, boolean isFree);

}

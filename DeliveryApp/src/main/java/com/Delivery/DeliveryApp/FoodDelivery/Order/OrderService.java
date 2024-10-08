package com.Delivery.DeliveryApp.FoodDelivery.Order;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Delivery.DeliveryApp.FoodDelivery.Item;
import com.Delivery.DeliveryApp.FoodDelivery.ItemRepository;

@Service
public class OrderService {


	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private ItemRepository itemRepo;

	public Orders placeOrder(Orders order) {

		order.setOrderPlacedTime(LocalDateTime.now());

		for(OrderedItem orderitem:order.getOrderdItem()) {
			Item item = itemRepo.findById(orderitem.getItem().getItem_id())
					.orElseThrow(() -> new RuntimeException("Item not found"));
			orderitem.setItem(item);
		}
		return orderRepo.save(order);
	}

}

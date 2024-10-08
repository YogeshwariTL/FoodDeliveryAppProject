package com.Delivery.DeliveryApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.Delivery.DeliveryApp.FoodDelivery", "com.Delivery.DeliveryApp.FoodDelivery.Order","com.Delivery.DeliveryApp.FoodDelivery.DeliveryAgent","com.Delivery.DeliveryApp.FoodDelivery.Restuarant","com.Delivery.DeliveryApp.FoodDelivery.User"})
public class DeliveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryAppApplication.class, args);
	}

}

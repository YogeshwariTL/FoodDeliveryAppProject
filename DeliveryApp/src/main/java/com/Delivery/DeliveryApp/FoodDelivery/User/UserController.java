package com.Delivery.DeliveryApp.FoodDelivery.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
	@Autowired
	private UserService user_service;
	//DTO
		@PostMapping("/save/user")
		public Users saveUserDetails(@RequestBody UserDTO userdto) {
			return user_service.saveUserDetails(userdto);
}
		@GetMapping("get/users")
		public List<Users> getAllUsers() {
			return user_service.getAllUsers();
		}
}

package com.Delivery.DeliveryApp.FoodDelivery.User;

import java.util.List;

public interface UserService {

	List<Users> getAllUsers();

	Users saveUserDetails(UserDTO userdto);


}

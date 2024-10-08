package com.Delivery.DeliveryApp.FoodDelivery.User;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	User_Repository user_repo;
	
	ModelMapper modelMapper=new ModelMapper();
	
	@Override
	public List<Users> getAllUsers() {
		return user_repo.findAll() ;
	}

	@Override
	public Users saveUserDetails(UserDTO userdto) {
		Users user= modelMapper.map(userdto, Users.class);
		return user_repo.save(user);
	}

}

package com.api.Gayathri_Api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.Gayathri_Api.entity.User;

@RestController
public class UserController {

	@GetMapping("/Users")
	public List<User> getAllUsers(){
		
		List<User> userList = new ArrayList<>();
		
		User u1 = new User(1l, "Gayathri Madappa", 22, "Female", "Bangalore");
		User u2 = new User(2l, "Sampath Kumar", 23, "Male", "Bangalore");
		User u3 = new User(3l, "Pramod", 24, "Male", "Yellahanka");
		User u4 = new User(4l, "Gayatri", 22, "Female", "Koppala");
		User u5 = new User(5l, "Ankith Gowda", 23, "Male", "Bangalore");
		User u6 = new User(6l, "Pravallika", 22, "Female", "Hyderabad");
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		
		return userList;
	}

}

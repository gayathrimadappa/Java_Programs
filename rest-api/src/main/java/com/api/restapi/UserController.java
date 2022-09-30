package com.api.restapi;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restapi.entity.User;

@RestController
public class UserController {

	@GetMapping("/Users")
	
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<>();
		User u1 = new User(1l,"Gayathri",20,"Female");
		User u2 = new User(2l,"Sampath",22,"Male");
		User u3 = new User(3l,"Pramoda",24,"Male");
		User u4 = new User(4l,"Gayathri",20,"Female");
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		return userList;
	}
}

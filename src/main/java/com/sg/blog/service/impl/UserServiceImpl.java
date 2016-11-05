package com.sg.blog.service.impl;

import org.springframework.stereotype.Service;

import com.sg.blog.model.User;
import com.sg.blog.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	public String createUser(User user) {

		System.out.println("Enetered into create user");
		
		return null;
	}

	public void deleteUser(String userId) {
		
		System.out.println("Enetered into delete user");
	}

	public String updateUser(User user) {
		
		System.out.println("Enetered into delete user");
		
		return null;
	}
	

	
	
}

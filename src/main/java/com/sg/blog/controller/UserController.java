package com.sg.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.blog.service.UserService;


@RestController
public class UserController {

	/**
	 * 
	 * 
	 * 
	 * @return
	 */
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(path="users", method=RequestMethod.POST)
	public String createUser(){
		
		String userId = userService.createUser();
		return null;
	}
	
}

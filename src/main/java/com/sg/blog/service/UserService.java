package com.sg.blog.service;

import com.sg.blog.model.User;




public interface UserService {

	public String createUser(User user);

	public void deleteUser(String userId);

	public String updateUser(User user);

}

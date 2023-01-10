package com.neosoft.exception.handling.service;

import java.util.List;

import com.neosoft.exception.handling.model.User;

public interface UserService {
	
	
	public User saveUser(User user);
	
	public List<User> getAllUser();
	
	public User getUser(int id);
	

}

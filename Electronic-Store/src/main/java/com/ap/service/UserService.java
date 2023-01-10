package com.ap.service;

import java.util.List;

import com.ap.dto.UserDto;

public interface UserService {

	// create
	public UserDto createUser(UserDto userDto);

	// update
	public UserDto updateUser(UserDto UserDto, String userId);

	// delete user
	public void deleteUser(String userId);

	// get all user
	public List<UserDto> getAllUser();

	// get user id
	public UserDto getUser(String UserId);
	
	//get user by email
	public UserDto getUserEmail(String email);
	
	
	
	

}

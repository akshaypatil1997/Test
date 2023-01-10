package com.ap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ap.dto.ApiResponseMessage;
import com.ap.dto.UserDto;
import com.ap.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/get/api")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public UserDto createUser(@Valid @RequestBody UserDto userDto) {

		return userService.createUser(userDto);

	}

	@PutMapping("/update/{userId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public UserDto updateUser(@Valid @RequestBody UserDto userDto, @PathVariable String userId) {

		return userService.updateUser(userDto, userId);

	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<ApiResponseMessage> deleteUser(@PathVariable String userId) {
		
		userService.deleteUser(userId);
		
		ApiResponseMessage api=ApiResponseMessage.builder()
				.message("user is Deleted")
				.status("not active user").build();
		
		return new ResponseEntity<ApiResponseMessage>(api,HttpStatus.OK);
		
	}

	@GetMapping("/getall")
	@ResponseStatus(HttpStatus.OK)
	public List<UserDto> getAllUser() {

		return userService.getAllUser();

	}

	@GetMapping("/get/{userId}")
	@ResponseStatus(HttpStatus.OK)
	public UserDto getUser(@PathVariable String userId) {
		return userService.getUser(userId);
	}

	@GetMapping("getemail/{email}")
	@ResponseStatus(HttpStatus.OK)
	public UserDto getUserByEmail(@PathVariable String email) {

		return userService.getUserEmail(email);

	}

}

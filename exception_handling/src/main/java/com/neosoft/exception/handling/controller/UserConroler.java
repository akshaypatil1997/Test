package com.neosoft.exception.handling.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.exception.handling.model.User;
import com.neosoft.exception.handling.service.UserService;

@RestController
@RequestMapping("/users")
public class UserConroler {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody @Valid User user){
		User u = userService.saveUser(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);	
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<List<User>> getAll(){
		
		return new ResponseEntity<List<User>>(userService.getAllUser(),HttpStatus.FOUND);
	}
	
	@GetMapping("/getuser/{id}")
	public ResponseEntity<User> getuserById(@PathVariable("id") int id){
		
		return new ResponseEntity<User>(userService.getUser(id),HttpStatus.FOUND);
	}
	
	

}

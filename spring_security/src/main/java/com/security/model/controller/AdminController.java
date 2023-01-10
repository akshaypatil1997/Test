package com.security.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.User;
import com.security.model.repository.RoleRepository;
import com.security.model.repository.UserRepository;

@RestController
@RequestMapping("/login")
public class AdminController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/save")
	public User addUser(@RequestBody User user) {
		
		String password = user.getPassword();
		String pwd = bCryptPasswordEncoder.encode(password);
		user.setPassword(pwd);
		return userRepository.save(user);
		
	}
	
	@GetMapping("/get")
	public String get() {
		return "Hello akshay";
	}
	

}

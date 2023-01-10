package com.jwttoken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwttoken.model.User;
import com.jwttoken.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		
		String password = user.getPassword();
		String pwd = passwordEncoder.encode(password);
		user.setPassword(pwd);
		
		return userRepository.save(user);
		
	}
	
	

}

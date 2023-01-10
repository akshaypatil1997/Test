package com.jwttoken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jwttoken.model.User;
import com.jwttoken.repository.UserRepository;

@SpringBootApplication
public class JwtTokenApplication implements CommandLineRunner {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(JwtTokenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * User user=new User(); user.setEmail("kailas@gmail.com");
		 * user.setPassword(passwordEncoder.encode("kailas@143"));
		 * 
		 * userRepository.save(user);
		 */
		
		
	}

}

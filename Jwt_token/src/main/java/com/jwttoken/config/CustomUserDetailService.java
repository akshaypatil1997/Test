package com.jwttoken.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwttoken.model.User;
import com.jwttoken.repository.UserRepository;


@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User user = userRepository.findByEmail(email);
		
		CustomUserdetail customUserdetail=null;
		
		if(user!=null) {
			customUserdetail=new CustomUserdetail();
			customUserdetail.setUser(user);
		}else {
			throw new UsernameNotFoundException("user"+user.getEmail()+" not found");
		}
		
		
		return customUserdetail;
	}

}

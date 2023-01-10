package com.neosoft.exception.handling.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.exception.handling.dto.UserNotFoundException;
import com.neosoft.exception.handling.model.User;
import com.neosoft.exception.handling.repository.UserRepository;
import com.neosoft.exception.handling.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		if (userRepository.findById(id).isPresent()) {
			return userRepository.findById(id).get();
		} else {

			throw new UserNotFoundException("user not found");
		}
	}

}

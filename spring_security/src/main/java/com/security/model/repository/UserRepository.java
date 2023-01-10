package com.security.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	public User findByUsername(String username);

}

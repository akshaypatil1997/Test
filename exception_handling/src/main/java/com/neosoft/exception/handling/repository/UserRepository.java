package com.neosoft.exception.handling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.exception.handling.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

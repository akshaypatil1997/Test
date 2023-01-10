package com.ap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id
	private String userId;
	
	@NotBlank(message = "name should not be empty")
	private String name;
	
	@Email(message = "Enter correct email")
	private String email;
	
	private String password;
	private String gender;
	
	

}

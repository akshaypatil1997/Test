package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.model.Samosa;

@Configuration
public class Config {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
}

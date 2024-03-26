package com.learning.ms.web;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AddressMs02Application {

	public static void main(String[] args) {
		SpringApplication.run(AddressMs02Application.class, args);
	}
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}


}

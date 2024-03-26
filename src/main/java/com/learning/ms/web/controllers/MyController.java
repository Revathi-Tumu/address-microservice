package com.learning.ms.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ms.web.dto.AddressDTO;
import com.learning.ms.web.service.AddressService;




@RestController
public class MyController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/hello")
	public String sayHello(){
	
		return "Hello World!";
	}
	
	@GetMapping("/address")
	public List<AddressDTO> getAllAddress(){
	
		return addressService.getAllAddress();
	}
	
	@GetMapping("/address/{id}")
	public AddressDTO getAddressById(@PathVariable String id){
		return addressService.getAddressById(id);
	}
	
	@PostMapping("/address")
	public AddressDTO saveEmpAaddress(@RequestBody AddressDTO addressDTO) {
		return addressService.saveEmpAddress(addressDTO);
	}
	
	
	


}

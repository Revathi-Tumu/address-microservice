package com.learning.ms.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ms.web.dto.AddressDTO;
import com.learning.ms.web.entity.AddressEntity;
import com.learning.ms.web.repo.AddressRepo;


@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	public List<AddressDTO> getAllAddress() {
	    List<AddressEntity> allAddress = addressRepo.findAll();
//	    System.out.println(allAddress);
	    List<AddressDTO> addressDTOs = new ArrayList<>();

	    for (AddressEntity address : allAddress) {
	        addressDTOs.add(modelMapper.map(address,AddressDTO.class));
	    }

	    return addressDTOs;
	}

	public AddressDTO getAddressById(String id) {
		System.out.println("Get Address for ID: "+id);
		Optional<AddressEntity> addressById = addressRepo.findById(id);
		return modelMapper.map(addressById,AddressDTO.class);
		
	}

	public AddressDTO saveEmpAddress(AddressDTO addressDTO) {
		AddressEntity addressEntity = modelMapper.map(addressDTO,AddressEntity.class);
		AddressEntity savedAddress = addressRepo.save(addressEntity);
		
		return modelMapper.map(savedAddress, AddressDTO.class);
	}

	
}

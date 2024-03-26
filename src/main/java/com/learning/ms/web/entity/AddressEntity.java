package com.learning.ms.web.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "EmployeeAddress")
public class AddressEntity {
	
	@Id
	private String addressId;
	private String address1;
	private String city;
	private String country;

}

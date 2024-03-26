package com.learning.ms.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
	
	private String addressId;
	private String address1;
	private String city;
	private String country;

}

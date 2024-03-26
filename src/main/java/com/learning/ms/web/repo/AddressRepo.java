package com.learning.ms.web.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.learning.ms.web.entity.AddressEntity;

public interface AddressRepo extends MongoRepository<AddressEntity, String> {

}

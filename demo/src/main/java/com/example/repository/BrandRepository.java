package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Brand;


/**
 * This is custom repository interface which extends the property of MongoRepositorty.
 * @author Kaushal
 *
 */

public interface BrandRepository extends MongoRepository<Brand, String>{

}

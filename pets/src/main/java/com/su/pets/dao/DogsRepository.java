package com.su.pets.dao;

import com.su.pets.entity.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DogsRepository extends MongoRepository<Dog, String> {

    public List<Dog> findBySize(String size);
}

package com.cmpe172.dogshelter.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cmpe172.dogshelter.model.Dog;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {

    List<Dog> findByBreed(String breed);
    
    

}
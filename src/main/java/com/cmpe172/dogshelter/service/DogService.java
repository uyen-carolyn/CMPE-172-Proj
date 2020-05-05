package com.cmpe172.dogshelter.service;

import java.util.List;
import java.util.Optional;

import com.cmpe172.dogshelter.model.Dog;

public interface DogService {
	//list all of dogs
    Iterable<Dog> findAll();
    //find one dog by its id
    Dog findOne(Integer id);
    //delete a dog using id
    void delete(Integer id);
    //save
    void save(Dog breed);
    //search by breed
    List<Dog> findByBreed(String breed);

}

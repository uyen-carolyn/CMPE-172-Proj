package com.cmpe172.dogshelter.service;

import com.cmpe172.dogshelter.model.Dog;
import com.cmpe172.dogshelter.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogImplement implements DogService {

    @Autowired
    private DogRepository dogRepository;

    @Override
    public Iterable<Dog> findAll() {
        return dogRepository.findAll();
    }
    
    @Override
    public Dog findOne(Integer id) {
        return dogRepository.findOne(id);
    }
    
    @Override
    public void save(Dog dog) {
        dogRepository.save(dog);
    }
    
    @Override
    public void delete(Integer id) {
        dogRepository.delete(id);
    }
    
//    @Override
//    public List<Dog> search(String breed) {
//        return dogRepository.findByNameContaining(breed);
//    }
    
    @Override
    public List<Dog> findByBreed(String breed) {
        return dogRepository.findByBreed(breed);
    }





}

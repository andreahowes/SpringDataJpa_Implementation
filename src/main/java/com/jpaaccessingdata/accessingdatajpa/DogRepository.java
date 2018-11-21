package com.jpaaccessingdata.accessingdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository <Dog, Long>{

    public List<Dog> findByBreed(String breed);
}

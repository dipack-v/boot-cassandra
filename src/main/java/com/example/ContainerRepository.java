package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ContainerRepository extends CrudRepository<Container, String>{
    List<Container> findAll();   
}

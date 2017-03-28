package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BillOfLandingRepository extends CrudRepository<BillOfLanding, Long>{
    List<BillOfLanding> findAll();   
    
}

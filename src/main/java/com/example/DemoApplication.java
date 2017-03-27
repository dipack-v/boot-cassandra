package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BillOfLandingRepository billOfLandingRepository) {
        return args -> {
            List<BillOfLanding> billOfLandings = new ArrayList<BillOfLanding>();
            BillOfLanding bol1 = new BillOfLanding("L71998091", 1, true);
            billOfLandings.add(bol1);
            BillOfLanding bol2 = new BillOfLanding("L71998092", 1, true);
            billOfLandings.add(bol2);
            billOfLandingRepository.save(billOfLandings);
        };
    }
}

@RestController
class BillOfLandingController{
    @Autowired
    BillOfLandingRepository billOfLandingRepository;
    @RequestMapping("/vessel")
    public List<BillOfLanding> findAll(){
        return billOfLandingRepository.findAll();
    }
}


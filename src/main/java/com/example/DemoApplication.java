package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ContainerRepository containerRepository) {
        return args -> {
            List<Container> containers = new ArrayList<Container>();
            Container c1 = new Container("MRKU5806034", "DRY", 40);
            containers.add(c1);
            Container c2 = new Container("MRKU5806035", "DRY", 40);
            containers.add(c2);
            containerRepository.save(containers);
        };
    }
}

@RestController
class ContainerController {
    @Autowired
    ContainerRepository containerRepository;

    @RequestMapping("/container")
    public List<Container> findAll() {
        return containerRepository.findAll();
    }

    @RequestMapping("/container/{id}")
    public Container findOne(@PathVariable String id) {
        return containerRepository.findOne(id);
    }
}

package com.jpaaccessingdata.accessingdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingdatajpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessingdatajpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(DogRepository dogRepository){
        return (args)->{
            dogRepository.save(new Dog("Shephard", 10));
            dogRepository.save(new Dog("lab", 5));
            dogRepository.save(new Dog("collie", 1));

            dogRepository.findAll().forEach(dog -> {
                System.out.println(dog.toString());
            });

            dogRepository.findByBreed("Shephard").forEach(dog->{
                System.out.println(dog.toString());
            });
            };
        }

}

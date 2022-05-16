package com.example.demo.adventure;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Configuration
public class AdventureConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            AdventureRepository repository) {
        return args -> {
            Adventure aq_devil = new Adventure(1, "Aquarium Devil", 1400000, "A++");
            Adventure fireDragon = new Adventure(2, "FireDragon", 999999, "A++");
            Adventure sp_devil = new Adventure(3, "Specific Devil", 1000000, "A++");
            Adventure vasilegin = new Adventure(4, "Vasilegin Vlad", 2000000, "A++");

            repository.saveAll(
                    Stream.of(aq_devil, fireDragon, sp_devil, vasilegin).collect(toList())
            );
        };
    }
}

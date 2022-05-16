package com.example.demo.adventure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Service
public class AdventureService {

    private final AdventureRepository adventureRepository;

    @Autowired
    public AdventureService(AdventureRepository adventureRepository) {
        this.adventureRepository = adventureRepository;
    }

    public List<Adventure> getAdventures() {
        return adventureRepository.findAll();
    }
}

//return Stream.of(
//                new Adventure(1, "Jack", 12000000, "A++")
//        ).collect(toList());

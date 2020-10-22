package com.wozu.labA.service;

import com.wozu.labA.model.Fruit;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FruitService {

    Optional<Fruit> getFruitById(Long id);
    Fruit getFruitByName(String name);
    Iterable<Fruit> getAllFruit();
    void saveFruit(Fruit fruit);
    Optional<Fruit> updateFruit(Fruit newFruit, Long id);
    void removeFruit(Long id);


}

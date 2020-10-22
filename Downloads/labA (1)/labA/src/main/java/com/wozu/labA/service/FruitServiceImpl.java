package com.wozu.labA.service;


import com.wozu.labA.model.Fruit;
import com.wozu.labA.repo.FruitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FruitServiceImpl implements FruitService{

    @Autowired
    FruitRepo fruitRepo;


    @Override
    public Optional<Fruit> getFruitById(Long id) {
        return fruitRepo.findById(id);
    }

    @Override
    public Fruit getFruitByName(String name) {
        return null;
    }


    @Override
    public Iterable<Fruit> getAllFruit() {
        return fruitRepo.findAll();
    }

    @Override
    public void saveFruit(Fruit fruit) {
        fruitRepo.save(fruit);
    }

    @Override
    public Optional<Fruit> updateFruit(Fruit newFruit, Long id) {
        fruitRepo.findById(id)
                .map(fruit -> {
                    fruit.setColor(newFruit.getColor());
                    fruit.setName(newFruit.getName());
                    fruit.setNeedsToBePeeled(newFruit.getNeedsToBePeeled());
                    fruit.setSize(newFruit.getSize());
                    fruit.setTropical(newFruit.getTropical());
                    return fruitRepo.save(fruit);
                });
        return fruitRepo.findById(id);
    }

    @Override
    public void removeFruit(Long id) {
        fruitRepo.deleteById(id);
    }
}

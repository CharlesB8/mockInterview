package com.wozu.labA.controller;


import com.wozu.labA.model.Fruit;
import com.wozu.labA.service.FruitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FruitController {

    @Autowired
    FruitServiceImpl fruitServiceImpl;

    @GetMapping("/get/fruit/{id}")
    public Optional<Fruit> getFruitById(@PathVariable Long id){
        return fruitServiceImpl.getFruitById(id);
    }

    @PostMapping("/post/athlete")
    public String saveFruit(@RequestBody Fruit fruit){
        fruitServiceImpl.saveFruit(fruit);
        return "fruit saved";
    }

    @PutMapping("/put/athlete/{id}")
    public Optional<Fruit> updateFruit(@RequestBody Fruit newFruit, @PathVariable Long id){
        return fruitServiceImpl.updateFruit(newFruit, id);
    }

    @DeleteMapping("/delete/athlete/{id}")
    public String deleteFruit(@PathVariable Long id){
        fruitServiceImpl.removeFruit(id);
        return "fruit deleted";
    }

}

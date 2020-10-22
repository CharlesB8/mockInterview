package com.wozu.labA.repo;

import com.wozu.labA.model.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepo extends CrudRepository<Fruit, Long> {
}

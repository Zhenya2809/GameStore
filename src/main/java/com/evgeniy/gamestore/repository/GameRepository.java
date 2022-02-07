package com.evgeniy.gamestore.repository;

import com.evgeniy.gamestore.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface GameRepository extends MongoRepository<Game,Integer> {
}

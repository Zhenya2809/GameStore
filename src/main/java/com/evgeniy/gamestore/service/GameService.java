package com.evgeniy.gamestore.service;

import com.evgeniy.gamestore.entity.Game;
import com.evgeniy.gamestore.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.math.BigInteger;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public Game createGame (String name, Integer price){
        Game game = new Game();
        game.setName(name);
        game.setPrice(price);
        return gameRepository.save(game);
    }
}

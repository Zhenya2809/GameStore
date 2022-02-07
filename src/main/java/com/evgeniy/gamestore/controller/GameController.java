package com.evgeniy.gamestore.controller;

import com.evgeniy.gamestore.entity.Game;
import com.evgeniy.gamestore.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class GameController {
    @Autowired
    GameService gameService;

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable Integer id) {
        return null;
    }

    @GetMapping("/games/{name}/{price}")
    public void createGames(@PathVariable String name,@PathVariable Integer price) {

        gameService.createGame(name, price);


    }
}

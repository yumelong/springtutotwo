package com.example.springtutotwo;

import com.example.springtutotwo.game.GameRunner;
import com.example.springtutotwo.game.PacManGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App01GamingBasicJava {

    public static void main(String[] args)
    {
        SpringApplication.run(App01GamingBasicJava.class, args);
        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}

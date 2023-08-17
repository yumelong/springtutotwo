package com.example.springtutotwo;

import com.example.springtutotwo.game.GameRunner;
import com.example.springtutotwo.game.GamingConsole;
import com.example.springtutotwo.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration
{
    @Bean
    public GamingConsole game()
    {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game)
    {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}

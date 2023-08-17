package com.example.springtutotwo;

import com.example.springtutotwo.game.GameRunner;
import com.example.springtutotwo.game.GamingConsole;
import com.example.springtutotwo.game.PacManGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;


public class App03GamingSpringBeans
{
    public static void main(String[] args)
    {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class))
        {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}

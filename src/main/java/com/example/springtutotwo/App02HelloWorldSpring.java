package com.example.springtutotwo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App02HelloWorldSpring {

    public static void main(String[] args)
    {
        //1: Launch a Spring Context -

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure the things tha we want Spring to manage- @Configuration
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("yourCustomBean"));
        System.out.println(context.getBean(Address.class));

    }

}

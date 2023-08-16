package com.example.springtutotwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) { }
record Address (String streetName, String city) { }
@Configuration
public class HelloWorldConfiguration
{
    @Bean
    public String name()
    {
        return "Yume";
    }

    @Bean
    public int age()
    {
        return 36;
    }

    @Bean
    public Person person()
    {
        return new Person("Flo", 35, new Address("Allee", "Stadt"));
    }

    @Bean
    public Person person2MethodCall()
    {
        return new Person(name(), age(), address());
    }

    @Bean(name = "yourCustomBean")
    public Address address()
    {
        return new Address("Wittenerstr", "Dortmund");
    }
}

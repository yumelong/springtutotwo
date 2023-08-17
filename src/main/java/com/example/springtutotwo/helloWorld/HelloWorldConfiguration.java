package com.example.springtutotwo.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    @Primary
    public Person person2MethodCall()
    {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2)
    {
        return new Person(name, age, address2);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address)
    {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address)
    {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address()
    {
        return new Address("Wittenerstr", "Dortmund");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3()
    {
        return new Address("Wittener", "Dorstfeld");
    }
}

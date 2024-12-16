package com.epicode.spring_w1_d1.configuration;

import com.epicode.spring_w1_d1.entity.Topping;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig  {
    @Autowired
    Faker faker;

    public Topping creaTopping(){
        Topping topping = new Topping();
        String[] toppingsNomi = {"Peperoni", "Olive Nere", "Prosciutto", "Salsiccia", "Ananas"};
        topping.setNome(faker.options().option(toppingsNomi));
        topping.setCalorie((int)faker.number().randomNumber());
        topping.setPrezzo(faker.number().randomDouble(2,1,3));
        return topping;
    }
}

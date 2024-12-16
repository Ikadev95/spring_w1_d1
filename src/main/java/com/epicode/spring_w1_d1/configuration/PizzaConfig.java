package com.epicode.spring_w1_d1.configuration;

import com.epicode.spring_w1_d1.entity.Pizza;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PizzaConfig {
    @Bean
    @Scope("prototype")
    public Pizza creaPizza(){
        Pizza pizza = new Pizza();
        pizza.setPrezzo(5.0);
        pizza.setCalorie(700);
        return pizza;
    }

}

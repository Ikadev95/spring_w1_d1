package com.epicode.spring_w1_d1.configuration;

import com.epicode.spring_w1_d1.entity.Bevanda;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BevandaConfig {
    @Autowired
    Faker faker;

    @Bean
    @Scope("prototype")
    public Bevanda creaBevanda(){
        Bevanda bevanda = new Bevanda();
        String[] bevandeNomi = {"Cola", "Aranciata", "Limonata", "Tonica", "Gazzosa", "Acqua Frizzante", "Acqua Naturale"};
        bevanda.setNome(faker.options().option(bevandeNomi));
        bevanda.setCalorie((int)faker.number().randomNumber());
        bevanda.setPrezzo(faker.number().randomDouble(2,3,7));
        return bevanda;
    }
}

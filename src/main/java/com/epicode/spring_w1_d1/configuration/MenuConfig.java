package com.epicode.spring_w1_d1.configuration;

import com.epicode.spring_w1_d1.entity.Menu;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {

    public Menu menu(){
        Menu menu = new Menu();
        return menu;
    }
}

package com.epicode.spring_w1_d1;

import com.epicode.spring_w1_d1.entity.Topping;
import com.epicode.spring_w1_d1.repository.ToppingRepo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);
	}
}

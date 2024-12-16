package com.epicode.spring_w1_d1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Topping extends Menu {

    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizze;
}
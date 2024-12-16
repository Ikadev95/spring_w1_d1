package com.epicode.spring_w1_d1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@Table(name = "toppings")
public class Topping {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private int calorie;
    private double prezzo;

    @ManyToMany (mappedBy = "toppings")
    private List<Pizza> pizze;

    @ManyToOne
    @JoinColumn(name = "menu")
    private Menu menu;
}
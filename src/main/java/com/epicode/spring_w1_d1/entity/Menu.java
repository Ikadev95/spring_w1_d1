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
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany (mappedBy = "menu")
    List<Pizza> pizze;

    @OneToMany (mappedBy = "menu")
    List<Topping> toppings;

    @OneToMany (mappedBy = "menu")
    List<Bevanda> bevande;
}
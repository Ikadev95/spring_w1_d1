package com.epicode.spring_w1_d1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "bevande")
public class Bevanda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private int calorie;
    private double prezzo;

    @ManyToOne
    @JoinColumn(name = "menu")
    private Menu menu;

}
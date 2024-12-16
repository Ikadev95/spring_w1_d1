package com.epicode.spring_w1_d1.entity;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome")
    protected String nome;
    @Column(name = "calorie")
    protected int calorie;
    @Column(name = "prezzo")
    protected double prezzo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }

    public int getCalorie() {
        return calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
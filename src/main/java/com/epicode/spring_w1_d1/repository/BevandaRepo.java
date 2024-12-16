package com.epicode.spring_w1_d1.repository;

import com.epicode.spring_w1_d1.entity.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepo extends JpaRepository<Bevanda, Long> {
}

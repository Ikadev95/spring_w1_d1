package com.epicode.spring_w1_d1.repository;

import com.epicode.spring_w1_d1.entity.Menu;
import com.epicode.spring_w1_d1.entity.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository <Topping, Long> {
}

package com.epicode.spring_w1_d1.repository;

import com.epicode.spring_w1_d1.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu, Long> {

}

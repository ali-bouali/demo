package com.demo.repositories;

import com.demo.entities.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdRepository extends JpaRepository<Ad, Long> {
}

package com.demo.repositories;

import com.demo.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubCategoryRepository extends JpaRepository<SubCategory, Long> {
}

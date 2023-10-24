package com.workintech.fruitapi.repository;

import com.workintech.fruitapi.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
}

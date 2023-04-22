package com.sepals.happyburger.ingredientsservice.repository;

import com.sepals.happyburger.ingredientsservice.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}

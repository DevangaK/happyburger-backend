package com.sepals.happyburger.ingredientsservice.repository;

import com.sepals.happyburger.ingredientsservice.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<specify model name, data type of the primary key>
public interface IIngredientRepository extends JpaRepository<Ingredient, Long> {
}

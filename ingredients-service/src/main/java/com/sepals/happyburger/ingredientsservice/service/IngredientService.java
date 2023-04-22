package com.sepals.happyburger.ingredientsservice.service;

import com.sepals.happyburger.ingredientsservice.model.Ingredient;
import com.sepals.happyburger.ingredientsservice.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class IngredientService {

    @Autowired
    private final IngredientRepository ingredientRepo;

    //HTTP request - GET method to fetch data from DB
    //fetch all
    public List<Ingredient> getIngredients(){
        return ingredientRepo.findAll();
    }

    //fetch by id
    public Ingredient getIngredientById(long id) {
        return ingredientRepo.findById(id).orElse(null);
    }

    //HTTP request - POST method to save data to DB
    //save all
    public List<Ingredient> saveIngredients(List<Ingredient> ingredients){
        return ingredientRepo.saveAll(ingredients);
    }

    //save one
    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }


}

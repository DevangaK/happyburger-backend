package com.sepals.happyburger.ingredientsservice.service;

import com.sepals.happyburger.ingredientsservice.model.Ingredient;
import com.sepals.happyburger.ingredientsservice.repository.IIngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//logic

@RequiredArgsConstructor
@Service
public class IngredientService {

    @Autowired
    private final IIngredientRepository ingredientRepo;

    //HTTP request - GET methods to fetch data from DB
    //fetch all ingredients
    public List<Ingredient> getIngredients(){
        return ingredientRepo.findAll();
    }

    //fetch ingredient by id
    public Ingredient getIngredientById(long id) {
        return ingredientRepo.findById(id).orElse(null);
    }

    //HTTP request - POST method to save data to DB
    //save all ingredients
    public List<Ingredient> saveIngredients(List<Ingredient> ingredients){
        return ingredientRepo.saveAll(ingredients);
    }

    //save one ingredient
    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }
    //take ingredient object as argument and save it using save(), inbuilt method given by jpa
}

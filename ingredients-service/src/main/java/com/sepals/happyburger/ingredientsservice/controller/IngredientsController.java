package com.sepals.happyburger.ingredientsservice.controller;

import com.sepals.happyburger.ingredientsservice.model.Ingredient;
import com.sepals.happyburger.ingredientsservice.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/ingredient")
@RequiredArgsConstructor
public class IngredientsController {

    @Autowired
    private final IngredientService ingredientService;

    //GET API
    @GetMapping("/ingredients")
    public List<Ingredient> showAllIngredients(){
        return ingredientService.getIngredients();
    }

    @GetMapping("ingredients/{id}")
    public Ingredient getIngredientById(@PathVariable long id) {
        return ingredientService.getIngredientById(id);
    }


    //POST API
    @PostMapping("ingredients/addAll")
    public List<Ingredient> addIngredients(@RequestBody List<Ingredient> ingredients){
        return ingredientService.saveIngredients(ingredients);
    }

    @PostMapping("ingredients/addOne")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.saveIngredient(ingredient);
    }
}
package com.sepals.happyburger.ingredientsservice.controller;

import com.sepals.happyburger.ingredientsservice.model.Ingredient;
import com.sepals.happyburger.ingredientsservice.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST APIs for logics in IngredientService

@RestController
//@RequestMapping("/ingredient")
@RequiredArgsConstructor
public class IngredientsController {

    @Autowired //Autowired -> handle all dependency injections
    private final IngredientService ingredientService;

    //GET APIs for all GET Methods in IngredientService
    //display all the ingredients in the DB
    @GetMapping("/ingredients")
    public List<Ingredient> showAllIngredients(){
        return ingredientService.getIngredients();
    }

    //display a specific ingredient filtered by the ingredient id
    @GetMapping("ingredients/{id}")
    public Ingredient getIngredientById(@PathVariable long id) {
        return ingredientService.getIngredientById(id);
    }


    //POST APIs for all POST Methods in IngredientService
    //save all the ingredients to the DB
    @PostMapping("ingredients/saveAll")
    public List<Ingredient> addIngredients(@RequestBody List<Ingredient> ingredients){
        return ingredientService.saveIngredients(ingredients);
        //RequestBody -> send ingredient details through JSON, so we can use Insomnia/Postman to test the API
    }

    //save a specific ingredient to the DB
    @PostMapping("ingredients/saveIngredient")
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.saveIngredient(ingredient);
    }
}
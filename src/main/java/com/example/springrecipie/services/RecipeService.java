package com.example.springrecipie.services;

import com.example.springrecipie.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

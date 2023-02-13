package com.example.springrecipie.controllers;

import com.example.springrecipie.domain.Category;
import com.example.springrecipie.domain.UnitOfMeasure;
import com.example.springrecipie.repos.CategoryRepository;
import com.example.springrecipie.repos.UnitOfMeasureRepository;
import com.example.springrecipie.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}

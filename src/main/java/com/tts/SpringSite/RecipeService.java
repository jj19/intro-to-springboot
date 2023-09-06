package com.tts.SpringSite;


import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private static final Logger logger = LoggerFactory.getLogger(RecipeService.class);

    // @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Transactional
    public Recipe saveRecipe(Recipe recipe) {

      try {
        Recipe savedRecipe = recipeRepository.save(recipe);
        // Add debug log statement
        logger.debug("Recipe saved: {}", savedRecipe);
        return savedRecipe;
    } catch (Exception e) {
        // Add error log statement
        logger.error("Error saving recipe: {}", e.getMessage(), e);
        throw e; // Rethrow the exception
    }

      // return recipeRepository.save(recipe);
  }

  public List<Recipe> getAllRecipes() {
      return (List<Recipe>) recipeRepository.findAll();
  }

  public Optional<Recipe> getRecipeById(Long id) {
      return recipeRepository.findById(id);
  }

  public void deleteRecipe(Long id) {
      recipeRepository.deleteById(id);
  }

  
}


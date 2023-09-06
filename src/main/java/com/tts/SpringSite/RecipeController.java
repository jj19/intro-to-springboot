package com.tts.SpringSite;

import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

  private final RecipeService recipeService;

  // @Autowired
  public RecipeController(RecipeService recipeService){
    this.recipeService = recipeService;
  }
  @GetMapping("/upload")
  public String recipeForm(Model model){
    model.addAttribute("recipe", new Recipe());
    return "upload";
  }

  @PostMapping("/result")
  public String recipeUpload(@ModelAttribute Recipe recipe, Model model) {
      Recipe savedRecipe = recipeService.saveRecipe(recipe);
      model.addAttribute("recipe", savedRecipe);
      return "result";
  }
  

  @GetMapping("/recipes")
  public String showAllRecipes(Model model) {
      List<Recipe> recipes = recipeService.getAllRecipes();
      model.addAttribute("recipes", recipes);
      return "recipes";
  }

}

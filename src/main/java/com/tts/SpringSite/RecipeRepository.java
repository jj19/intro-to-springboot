package com.tts.SpringSite;

import org.springframework.data.jpa.repository.JpaRepository;
public interface RecipeRepository extends JpaRepository<Recipe, Long>{}


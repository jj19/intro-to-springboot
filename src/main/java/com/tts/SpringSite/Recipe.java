package com.tts.SpringSite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Recipe {
 
 
  @Id
  public long id;


  private static int counter = 0;
  private String name;
  private String ingredients;
  private String steps;
  private String source;

  public Recipe(){
    this.id = ++counter;
  }


  public long getId(){
    return id;
  }


  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getIngredients(){
    return ingredients;
  }

  public void setIngredients(String ingredients){
    this.ingredients = ingredients;
  }

  public String getSteps(){
    return steps;
  }

  public void setSteps(String steps){
    this.steps = steps;
  }
  
  public String getSource(){
    return source;
  }

  public void setSource(String source){
    this.source = source;
  }
}

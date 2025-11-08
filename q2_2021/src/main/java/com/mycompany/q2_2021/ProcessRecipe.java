/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2_2021;

/**
 *
 * @author User
 */
public class ProcessRecipe extends Recipes {
    
    public ProcessRecipe(String Ingredients, int Time, int Level) {
          super(Ingredients, Time, Level);
    }
    
    @Override
    public void PrintRecipes() {
        System.out.println("*".repeat(100));
        System.out.println("\nIngredients: " + getIngredients() 
                           + "\nTime to make: " + getTime()
                           +"\nDifficulty Level: " + getLevel()
                           +"\n");
        
        System.out.println("*".repeat(100));
    }
    
    
}

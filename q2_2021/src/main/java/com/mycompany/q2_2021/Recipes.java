/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2_2021;

/**
 *
 * @author User
 */
public abstract class Recipes implements iRecipes {
    
    public String Ingredients;
    public int Time;
    public int Level;

    public Recipes (String Ingredients, int Time,int Level) {
      this. Ingredients = Ingredients;
      this.Time= Time;
      this.Level= Level;
}
    
 public String getIngredients() {
return Ingredients;
   
}
 public int getTime() {
     return Time;
     
 }
 
 public int getLevel() {
     return Level;
 }


}

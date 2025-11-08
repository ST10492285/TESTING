/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q2_2021;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q2_2021 {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner (System.in);
        
        System.out.print("Enter the ingredients: ");
        String ingredients = kb.nextLine();
        
        System.out.println("Enter Time to make (in minutes) : ");
        int time = kb.nextInt();
        
        System.out.println("Enter Difficulty level: ");
        int level = kb.nextInt();
        ProcessRecipe pc = new ProcessRecipe(ingredients, time, level );
        pc.PrintRecipes();
    }
}

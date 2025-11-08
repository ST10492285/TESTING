/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4arraycamera;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q4ArrayCamera {

    public static void main(String[] args) {
        //Import Scanner
        Scanner kb = new Scanner(System.in);
        
        //Create a 2D Array to hold the values in the table
        int [][] cameraCost = {{10500,8500},
                               {9500,7200},
                               {12000,8000}};
        //create a 1D Array for the types of camera and manufacturers
        String[] Types = {"Mirrorless","DSLR"};
        String [] Manufacturer = {"CANNON", "SONY" , "NIKON" };
        
        //Display
        System.out.println("-".repeat(50) + "\nCamera Technology Report\n" + "-".repeat(50));
        System.out.println("\t"+ Types[0] + "\t" + Types[1]);
        //Implement for loop
        
        //outer Loop --> Row
        for (int i = 0; i <cameraCost.length;i++) {
            System.out.print(Manufacturer[i] + "\t");
            
            //Inner Loop --> Columns
            for(int j = 0; j < cameraCost[i].length; j++) {
                System.out.print(cameraCost[i][j]+ "\t\t");
            }
            //Leave a line
            System.out.println();
            }
        //display
        System.out.println("-".repeat(50) + "\nCamera Technology Results\n" + "-".repeat(50));
        
        //Track Largest Difference
        int maxDiff = 0;
        String maxDiffManufacturer = "";
        
        //Go through the 1d Array
        for (int i = 0; i < Manufacturer.length; i++) {
            
            //Calculate difference between mirrorless and DSLR for each manufacturer
            int diff = Math.abs(cameraCost[i][0] - cameraCost[i][1]);
            
            //update maximum tracker
            if (diff > maxDiff) {
                maxDiff = diff;
                maxDiffManufacturer = Manufacturer[i];
            }
            //check if total is greater than 2500 then display with ***
            if (diff >= 2500) {
                System.out.println(Manufacturer[i] +"\t" + diff + "***");
            }else {
                System.out.println(Manufacturer[i] + "\t" +diff);
            }
        }
        
        //Display manufacturer with most cost difference
        System.out.println("\nCamera with the most cost difference: " + maxDiffManufacturer);
        System.out.println("-".repeat(50));
    }

}


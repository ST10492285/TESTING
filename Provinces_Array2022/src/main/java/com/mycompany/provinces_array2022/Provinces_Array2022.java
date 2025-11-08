/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provinces_array2022;

/**
 *
 * @author User
 */
public class Provinces_Array2022 {

    public static void main(String[] args) {
        
        //create a 2D Array
        int [][] prices = {{800000,1500000,2000000},
                           {700000,1200000,1600000},
                           {750000,1300000,1800000}};
        
        //create 1D array
        String[] Topics = {"FLAT", "TOWNHOUSE" , "HOUSE"};
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        
        //2d array to store three average prices for three provinces
        double[] avg = new double [prices.length];
        
        //display
        System.out.println("\t\t" + Topics[0] + "\t\t" + Topics[1] + "\t\t" + Topics[2]);
        System.out.println("-".repeat(60));
                
                for  (int i = 0; i < prices.length; i++)  {
                    System.out.print(provinces[i] + "\t\t");
                    
                    for (int j = 0; j < prices[i].length; j++){
                        System.out.println(prices[i][j] + "\t\t");
                        avg[j] += prices[i][j];
                }
                 System.out.println("");
             }
                //calculate average per property type
                for(int j = 0; j < avg.length; j++) {
                    avg[j] /= prices.length;// divide the number of provinces
                    System.out.println("Average Property Price In " + provinces[j] + " R"+(int)avg[j] + "\t\t");
                    
                }
                
              }       
              }

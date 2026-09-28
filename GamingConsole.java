/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsole;

/**
 *
 * @author Student
 */
public class GamingConsole {
        
    public static void main(String[] args) { 

        // City names and console names 

        String[] cities= {"Cape Town", "Port Elizabeth", "Pretoria"}; 

  

        String[] consoles= {"PS5", "Xbox", "Switch"}; 

  

        //Consoles, columns and cities 

        int [][]sales = { 

            {1000, 2000, 1500},//PS5 

            {2000, 3000, 1100},//Xbox 

            {3000, 4000, 1200},//Switch 

        }; 

        //To store the total sales for each city 

        int[]cityTotals = new int[3]; 

  

        //Calculation for the total sales for each city it adds up on each column 

        for(int col= 0; col< cities.length;col++){ 

            for(int row= 0; row<consoles.length;row++){ 

                cityTotals[col]= cityTotals[col]+ sales[row][col]; 

            } 

        } 

        //Finding the city with the most sales 

        int highestIndex =0; 
        for(int i=1;<cityTotals.length<=;i++){
            if(cityTotals[i]> cityTotals[highestIndex])
            {
                highestIndex=i;
            }

     } 

//Display the Report 

        System.out.println("Gaming Console Report"); 

        System.out.println("====================="); 

  

        //The head rows with city names  

        System.out.printf("%-10s",""); 
        for(int i= 0; i<cities .length;i++){
      System.out.printf("%-18s", cities[i]); 

 } 
     System.out.println(); 

 

// Sales rows: console name followed by its sales in each city 
for (int row = 0; row < consoles.length; row++) { 
     System.out.printf("%-10s", consoles[row]); 
      for(int col = 0; col < cities.length; col++) { 
      System.out.printf("%-18d", sales[row][col]); 

      } 
      
      System.out.println(); 

} 

     // Totals for each city 
     System.out.println(); 
       System.out.println("CONSOLE SALES TOTALS FOR EACH CITY"); 

        System.out.println("----------------------------------"); 
       for (int i = 0; i < cities.length; i++) {
           
           System.out.printf("%-18s", cities[i]); 
}
       System.out.println(); 

       for (int i = 0; i < cityTotals.length; i++) { 
        System.out.printf("%-18d", cityTotals[i]); 

} 

         System.out.println(); 

 
// City with the most sales 

       System.out.println(); 

     System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]); 

} 

}



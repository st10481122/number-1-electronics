/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles {
    // Subclass that extends the abstract Consoles class  
// Constructor passes the values up to the parent class using super 
  public ConsoleSales(String consoleType, String store, int totalSales) { 

  method(consoleType, store, totalSales); 

} 

        public void method(String consoleType, String store, int totalSales) {
            super(consoleType, store, totalSales);
        }

 // Code for the abstract printReport method 

  @Override 

public void printReport() { 
  System.out.println("CONSOLE SALES REPORT"); 
  System.out.println("--------------------"); 
  System.out.println("CONSOLE TYPE: " + getConsoleType());  
  System.out.println("STORE: " + getStore()); 
  System.out.println("TOTAL SALES: " + getTotalSales()); 

} 
}

       
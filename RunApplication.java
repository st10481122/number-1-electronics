/* import java.util.Scanner; 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoleapplication;

/**
 *
 * @author Student
 */
public class RunApplication {
  
 public static void main(String[] args) { 
  Scanner input = new Scanner(System.in); 

 // Step 1: let the user select the console type 

System.out.println("Select the console type");
System.out.println("1) PS5"); 
System.out.println("2) XBOX"); 
System.out.println("3) SWITCH"); 

int choice = input.nextInt(); 
input.nextLine();// clears the leftover Enter key press 

 // Turn the number into a console name 
String consoleType; 
if (choice == 1) { 
consoleType = "PS5"; 
} else if (choice == 2) { 

consoleType = "XBOX"; 
} else if (choice == 3) { 
consoleType = "SWITCH"; 
} else { 

System.out.println("Invalid choice. Please run the program again."); 
input.close(); 
return;// stop the program 
} 

 

// Step 2: get the store name and total sales
System.out.print("Enter the store: "); 
String store = input.nextLine(); 
System.out.print("Enter the total sales of " + consoleType 
+ " consoles for " + store + ": "); 
int totalSales = input.nextInt(); 

 
// Step 3: create the ConsoleSales object and print the report 

ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales); 
System.out.println(); 
sales.printReport(); 
input.close(); 
} 

} 

 
    


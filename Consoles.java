/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/* public abstract class Consoles implements IConsoles { */
package com.mycompany.consoleapplication;

/**
 *
 * @author Student
 */
abstract class Consoles {
    

    // Abstract class: we cannot create a Consoles object directly. 

// It implements the IConsoles interface, so it must have the three get methods. 
// Variables to store the data 
 private String consoleType; 
 private String store; 
 private int totalSales; 

 // Constructor 
public Consoles(String consoleType, String store, int totalSales) { 
this.consoleType = consoleType;
this.store = store; 
this.totalSales = totalSales; 

} 

 
// Methods required by the interface 

@Override 

public String getConsoleType() { 
return consoleType; 
} 

 
@Override 
public String getStore() { 
return store; 
} 

 

@Override 
public int getTotalSales() { 
return totalSales; 
} 

 

// Abstract method: the subclass must write the code for it 
public abstract void printReport(); 

} 

 


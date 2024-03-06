/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;


/**
 * Factory class for creating instances of vehicles based on type.
 * This class provides a simple factory method to create instances of vehicles.
 * It supports creating instances of Helicopter and Jeep types.
 * @author jayalee
 */
//VehicleFactory class implementing Simple Factory Pattern
public class VehicleFactory {
 // Method to create instances of vehicles based on type
 public Vehicle createVehicle(String type) {
     switch (type.toLowerCase()) {
         case "helicopter":
             return new Helicopter();
         case "jeep":
             return new Jeep();
         default:
             throw new IllegalArgumentException("Invalid vehicle type: " + type);
     }
 }
}
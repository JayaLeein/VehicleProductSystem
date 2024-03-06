/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author jayalee
 */
public class Main {
    public static void main(String[] args) {
        // Create a VehicleFactory instance
        VehicleFactory factory = new VehicleFactory();

        // Create a helicopter using the factory
        Vehicle helicopter = factory.createVehicle("helicopter");
        helicopter.start();
        helicopter.stop();

        // Create a jeep using the factory
        Vehicle jeep = factory.createVehicle("jeep");
        jeep.start();
        jeep.stop();
        
        // Create a VehicleDirector instance with a HelicopterBuilder
        VehicleDirector director = new VehicleDirector(new HelicopterBuilder());
        
        // Print details of the constructed helicopter
        System.out.println(helicopter); // This will invoke the overridden toString() method

        // Change the builder to a JeepBuilder
        director.changeBuilder(new JeepBuilder());
        
        // Print details of the constructed jeep
        System.out.println(jeep); // This will also invoke the overridden toString() method
 
        
    }
}


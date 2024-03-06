/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author jayalee
 */
class VehicleDirector {
    private VehicleBuilder vehicleBuilder;
    
    public VehicleDirector(VehicleBuilder builder) {
        this.vehicleBuilder = builder;
    }
    
    public void changeBuilder(VehicleBuilder builder) {
        this.vehicleBuilder = builder;
    }
    
    // Method to construct a vehicle
    public Vehicle constructVehicle() {
        this.vehicleBuilder.buildEngine();
        this.vehicleBuilder.buildChassis();
        this.vehicleBuilder.buildBodyPanels();
        this.vehicleBuilder.buildWheels();
        return this.vehicleBuilder.getVehicle();
    }
}
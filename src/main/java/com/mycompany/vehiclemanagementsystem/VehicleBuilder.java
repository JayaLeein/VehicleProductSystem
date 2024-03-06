/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 * VehicleBuilder interface for building different parts of a vehicle
 * @author JingYi Li
 */
interface VehicleBuilder {
    
    void buildEngine();
    void buildChassis();
    void buildBodyPanels();
    void buildWheels();
    
    Vehicle getVehicle();
    
}


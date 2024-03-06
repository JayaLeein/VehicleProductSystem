/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author jayalee
 */
public class HelicopterBuilder implements VehicleBuilder {
    
    private Vehicle helicopter = new Helicopter();

    @Override
    public void buildEngine() {
        helicopter.engine = "Helicopter Engine";
    }

    @Override
    public void buildChassis() {
        helicopter.chassis = "Helicopter Chassis";
    }

    @Override
    public void buildBodyPanels() {
        helicopter.bodyPanels = "Helicopter Body Panels";
    }

    @Override
    public void buildWheels() {
        helicopter.wheels = 2;
    }
                
    @Override
    public Vehicle getVehicle() {
        System.out.format("Built a helicopter: %s, %s, %s, %s Wheels\n", this.helicopter.engine, helicopter.chassis, helicopter.bodyPanels, helicopter.wheels);
	return this.helicopter;
    }
    
}

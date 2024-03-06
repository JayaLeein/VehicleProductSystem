/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 *
 * @author jayalee
 */
public class JeepBuilder implements VehicleBuilder {
    
    private Vehicle jeep = new Jeep();

    @Override
    public void buildEngine() {
        jeep.engine = "Jeep Engine";
    }

    @Override
    public void buildChassis() {
        jeep.chassis = "Jeep Chassis";
    }

    @Override
    public void buildBodyPanels() {
        jeep.bodyPanels = "Jeep Body Panels";
    }

    @Override
    public void buildWheels() {
        jeep.wheels = 4;
    }
                
    @Override
    public Vehicle getVehicle() {
        System.out.format("Built a jeep: %s, %s, %s, %s Wheels\n", this.jeep.engine, jeep.chassis, jeep.bodyPanels, jeep.wheels);
	return this.jeep;
    }
    
}

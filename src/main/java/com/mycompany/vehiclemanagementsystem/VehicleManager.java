/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

import java.util.LinkedList;

/**
 * Singleton VehicleManager class
 * @author JingYi Li
 */
public class VehicleManager {
        
        public static VehicleManager INSTANCE;
        
        private  LinkedList<Vehicle> parts;
        
        private VehicleManager(){   
            parts = new LinkedList<>();
        }
        
        public static VehicleManager getInstance() {
            if(INSTANCE == null) {
                INSTANCE = new VehicleManager();
            }
            
            // Create multiple instances that refer to the same object
            return INSTANCE;
        }
        
        
        public LinkedList<Vehicle> getVehicles() {
            return parts;
        }
        
}


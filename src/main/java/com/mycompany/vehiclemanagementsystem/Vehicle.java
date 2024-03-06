/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiclemanagementsystem;

/**
 * Interface of Simple Factory for product
 * @author JingYi Li
 */

abstract class Vehicle {
    
    String engine;
    String chassis;
    String bodyPanels;
    int wheels;
    
    //common_methid()
    abstract void start();
    abstract void stop();

}

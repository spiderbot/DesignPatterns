package org.piyush.joshi.designpatterns.creational.factory;

public class Truck implements IVehicle {


    @Override
    public void createVehicle() {
        System.out.println("truck created");
    }
}

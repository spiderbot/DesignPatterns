package org.piyush.joshi.designpatterns.creational.factory;

public class Bus implements IVehicle{


    @Override
    public void createVehicle() {
        System.out.println("bus created");
    }
}

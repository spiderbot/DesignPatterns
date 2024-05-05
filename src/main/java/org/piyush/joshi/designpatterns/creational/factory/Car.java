package org.piyush.joshi.designpatterns.creational.factory;

public class Car implements IVehicle{


    @Override
    public void createVehicle() {
        System.out.println("car created");
    }
}

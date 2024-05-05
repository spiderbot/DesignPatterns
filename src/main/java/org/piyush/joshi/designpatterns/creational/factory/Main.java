package org.piyush.joshi.designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
                factory.getVehicle("car").createVehicle();

    }
}

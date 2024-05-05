package org.piyush.joshi.designpatterns.creational.factory;

public class VehicleFactory {

    public IVehicle getVehicle(String vehicleType){
        switch (vehicleType){
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "bus":
                return new Bus();
        }
        return null;
    }
}

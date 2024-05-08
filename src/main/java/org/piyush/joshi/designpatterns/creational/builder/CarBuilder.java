package org.piyush.joshi.designpatterns.creational.builder;

public class CarBuilder implements IBuilder{

    @Override
    public void setCarType(String type) {

    }

    @Override
    public void setEngine(String engine) {

    }

    @Override
    public void setSeats(int seats) {

    }

    public Car getResult(){
        return new Car();
    }
}

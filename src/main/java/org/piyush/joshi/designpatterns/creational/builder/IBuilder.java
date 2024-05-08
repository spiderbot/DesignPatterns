package org.piyush.joshi.designpatterns.creational.builder;

public interface IBuilder {

    void setCarType(String type);
    void setEngine(String engine);

    void setSeats(int seats );
}

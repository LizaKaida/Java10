package com.company;

import com.company.devices.Car;

public class Disel extends Car {
    public Disel( String producer, String model, Integer yearOfProduction, String color){
        super(producer, model, yearOfProduction, color);
    }

    @Override
    public void Refuel() {
        System.out.println("tankowanie");

    }
}

package com.company;

import com.company.devices.Car;

public class Electric extends Car {
    public Electric(String producer, String model, Integer yearOfProduction, String color){
        super(producer, model, yearOfProduction, color);
    }

    @Override
    public void Refuel() {
        System.out.println("tankowanie");
    }

}

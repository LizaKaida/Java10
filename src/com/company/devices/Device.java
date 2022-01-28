package com.company.devices;

import com.company.Applications;
import com.company.Saleable;

abstract public class Device implements Saleable {

    String producer;
    String model;
    Integer yearOfProduction;
    String color;
    public Double value;

    public Device(String producer, String model, Integer yearOfProduction, String color) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.value = 0.0;
    }
    public Integer getAge(){
        return 2021 - yearOfProduction;


    }
    abstract public void turnOn();
    abstract public boolean isTurnedOn();

}



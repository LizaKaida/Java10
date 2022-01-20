package com.company;

abstract public class Device implements Saleable{

    String producer;
    String model;
    Integer yearOfProduction;
    String color;

    public Device(String producer, String model, Integer yearOfProduction, String color) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }
    public Integer getAge(){
        return 2021 - yearOfProduction;


    }
    abstract public void turnOn();
    abstract public boolean isTurnedOn();

}



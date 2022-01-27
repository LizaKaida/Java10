package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {

    public Double engineVolume;
    public String model;
    public String yearOfProduction;
    public String plates;
    public Double capacitance;


    public Car(String producer, String model, Integer yearOfProduction, String colour, Double engineVolume) {
        super( producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
    }
    public String toString() {
        return "Producent:" + this.producer + "model:"+ this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("przekrecam kluczyk");
        System.out.println("silnik odpalil");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("nie masz kasy");
        }else if(!seller.hasCar(this)) {
            System.out.println("nie masz samochodu");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("udalo sie sprzedac za" + price + "pln");

        }
    }
    public abstract void Refuel();



}




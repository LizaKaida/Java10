package com.company;

public class Car extends Device implements Saleable{

    public Double engineVolume;
    private String plates;


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
        }else if(!buyer.hasFreeSpace()){
            System.out.println("nie masz miejsca");
        }
        else{
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("udalo sie sprzedac za" + price + "pln");

        }
    }


}




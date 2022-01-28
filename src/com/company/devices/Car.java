package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Saleable {

    public Double engineVolume;
    public String model;
    public String yearOfProduction;
    public String plates;
    public Double capacitance;
    public List<Human> owners;
    public List<Human> sellers;
    public List<Human> buyers;
    public List<Human> currentOwner;


    public Car(String producer, String model, Integer yearOfProduction, String colour, Double engineVolume) {
        super( producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
        this.owners = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.buyers = new ArrayList<>();
        this.currentOwner = new ArrayList<>();
    }

    public Car(String producer, String model, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction, color);
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
        } else if (seller != currentOwner){
            System.out.println("nie jestes wlascicielem samochodu");
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
    
    public Integer transactionCount (){
        int counter = 0;
        String[] transactions = new String[0];
        for(String transaction : transactions){
            counter +=1;
        }
        return counter;
    }
    public void carOwners(){
        int counter = 1;
        if(owners.size() == 0){
            System.out.println("0 wlascicieli");
        } else {
            for(Human human : owners){
                if(counter == owners.size()){
                    this.currentOwner = (List<Human>) human;
                    System.out.println(counter + " " + this.currentOwner + " wlaściciel pojazdu");
                }else{
                    System.out.println(counter + " " + human);
                    counter += 1;
                }

                }
            }
        }
    public boolean checkOwners(){
        return owners.size() != 0;
    }

    public boolean checkSelling(Human seller, Human buyer){
        for (int i = 0; i < transactionCount(); i++) {
            if(sellers.contains(seller) && buyers.contains(buyer))
                if(sellers.get(i) == seller && buyers.get(i) == buyer){
                    return true;
                }
        }
        return false;
    }
    }






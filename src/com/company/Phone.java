package com.company;

import java.net.URL;
import java.util.List;

public class Phone  extends Device implements Saleable{

    Integer ramSize;
    String ramText;
    Integer totalStorage;


    public Phone(String producer, String model, Integer yearOfProduction, String colour, Integer ramSize, Integer totalStorage) {
        super(producer, model, yearOfProduction, colour );
        this.ramSize = ramSize;
        this.totalStorage = totalStorage;
        this.ramText = ramSize + "GB";

    }

    @Override
    public String toString(){
        return "Phone{" +
                "producer='" + producer + '\''+
                ", model=' "+ model +'\''+
                ", yearOfProduction=' " + yearOfProduction + '\''+
                ", ramText=' " + ramText + '\''+
                ", totalStorage=' " +  totalStorage +
                '}';
    }
    public void turnOn() {
        System.out.println("wciskam guzik");
        System.out.println("czekam");
        System.out.println("o jest");

    }
    public boolean isTurnedOn(){
        return true;}
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("nie masz $");
        } else if (seller.mobile != this){
            System.out.println("nie masz telefonu");
        }else {
            seller.cash += price;
            buyer.cash -= price;
            seller.mobile = null;
            buyer.mobile = this;
            System.out.println("udalo sie sprzedac telefon za"+ price +"pln");
        }
    }


    public void installAnApp(String appName){

    }
    public void installAnApp(String appNAme, String version){

    }
    public void installAnApp(String appName, String version, String server){

    }
    public void installAnApp(List<String> appNames){

    }
    public void installAnApp(URL url){

    }





}



package com.company;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone  extends Device implements Saleable{

    private static final String DEFAULT_APP_VERSION ="latest" ;
    private static final String DEFAULT_APP_SERVER = "appstore.wsb.com";
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


    public void installAnApp(String appName)  {
        System.out.println("instalowanie aplikacji wg nazwy"+appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);

    }
    public void installAnApp(String appName, String version)  {
        System.out.println("instalowanie aplikacji wg nazwy:" +appName +"i wersji"+ version);
        this.installAnApp(appName, version, DEFAULT_APP_SERVER);

    }
    public void installAnApp(String appName, String version, String server)  {
        System.out.println("instalowanie aplikacji wg nazwy"+appName +"wersji");
        try{
            URL url = new URL("https",server,443,appName +" - "+version );
        } catch (MalformedURLException e){
            System.out.println("nie udalo sie zainstalowac"+ appName);
        }

    }
    public void installAnApp(List<String> appNames){
        System.out.println("instalowanie aplikacji z listy");
        for(String appName: appNames){
            this.installAnApp(appName);
        }

    }
    public void installAnApp(URL url){
        System.out.println("sprawdzanie adresu docelowego");
        System.out.println("sprawdzaie miejsca na telefonie");
        System.out.println("obsluga platnosci");
        System.out.println("instalacja");

    }





}



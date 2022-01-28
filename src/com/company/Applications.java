package com.company;

public class Applications {
    public String name;
    public String version;
    public Double price;
    public boolean appIsInstalled;

    public Applications(String name, String version, Double price){
        this.name = name;
        this.version = version;
        this.price = price;
        this.appIsInstalled = false;
    }
    public Double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "app name:" + name + "version:" + version + "Price:" + price;

    }
}

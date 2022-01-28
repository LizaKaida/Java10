package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 10;
    public boolean getSalary;
    public boolean species;
    public Human human;
    public Phone mobile;
   public Car[] garage;
    String Human_Species = "homo sapiens";

    public String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    Animal pet;


    public Double getSalary() {
        return salary;
    }


    public Human() {
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 2000.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName) {
        super("homo sapiens");
        this.firstName = firstName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;

    }

    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("nie masz $");
        } else if (seller.human != this) {
            System.out.println("nie masz czlowieka");
        } else {
            System.out.println("nie wolno handlowac ludzmi");
        }
    }
    public Car getCar(Integer space){
        return garage[space];
    }
    public void setCar(Car car, Integer space){
        if(salary>car.value){
            if(garage[space] != null ){
                this.garage[space] = car;
                System.out.println("udalo sie kupic auto");
            } else {
                System.out.println("to miejsce zajete w garazu");
            }
        }
    }
    public void removeCar(Car car){
        for(int i = 0; i < this.garage.length; i++){
            if(this.garage[i] == car){
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println("usunieto " + car );
            }
        }
    }
    public void addCar (Car car){
        Integer space = 0;
        for (int i = 0; i < this.garage.length; i++) {
            if(this.garage[i] == null){
                this.garage[i] = car;
                System.out.println("dodano samochod");
                i = this.garage.length;
            } else {
                if(i == this.garage.length - 1){
                    System.out.println("nie ma miejsca ");
                }
            }
        }
    }
    public boolean hasCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null && this.garage[i].equals(newCar)) {
                return true;
            }
        }
        return false;
    }

    public Double getGarageValue(){
        Double totalValue = 0.0;
        for (Car car : this.garage){
            if (car != null){
                totalValue += car.value;
            }
        }
        System.out.println("Wartosc wszystkich samochodow:");
        return totalValue;
    }
}




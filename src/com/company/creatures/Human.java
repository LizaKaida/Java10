package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public abstract class Human extends Animal {
    private static final int DEFAULT_GARAGE_SIZE = 10;
    public boolean getSalary;
    public boolean species;
    public Human human;
    public Phone mobile;
    public Car car;
    String Human_Species = "homo sapiens";

    public String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    public Car[] garage;
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

    public boolean hasCar(Car newCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null && this.garage[i].equals(newCar)) {
                return true;
            }
        }


        return false;
    }
}



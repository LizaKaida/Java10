package com.company;

import com.company.creatures.Animal;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Canis") {
            @Override
            public void sale(Human seller, Human buyer, Double price) {

            }

        };
        Animal cat = new Animal("Puszek") {
            @Override
            public void sale(Human seller, Human buyer, Double price) {
            }
        };

        Phone phone = new Phone ("apple", "iphone13", 2021, "white", 4,3);
        Phone xiaomi = new Phone ("xiaomi", "mi8",2018, "black", 4, 3);

        Car fiat = new Car ("Fiat", "Bravo", 2016, "red", 3.0);
        Car masserati = new Car("VW", "Passat", 2004, "black", 3.0);


        System.out.println("model: " + fiat.model );
        System.out.println("rok produkcji:" + fiat.yearOfProduction);
        System.out.println(fiat);

        Human me = new Human() {
        };

        me.setSalary(1000.0);
        System.out.println(me.getSalary);


        me.feed();
        me.takeForAWalk();
        System.out.println(me.species);
        System.out.println(me.firstName);

        System.out.println(fiat.getAge());


        Animal cat1 = new Animal("Puszek") {
            @Override
            public void sale(Human seller, Human buyer, Double price) {

            }
        };

        fiat.turnOn();
        fiat.isTurnedOn();
        phone.turnOn();
        phone.isTurnedOn();

        Human brotherInLow = new Human(){};

        brotherInLow.cash = 10000.0;
        me.car = fiat;
        me.pet = cat;
        me.human = me;

        fiat.sale(me, brotherInLow, 8000.0);
        me.sale(me, brotherInLow, 300.0);

    }
}

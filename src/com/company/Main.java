package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Pet("Canis") {


        };
        Animal cat = new Pet("Puszek") {

        };

        Phone phone = new Phone ("apple", "iphone13", 2021, "white", 4,3);
        Phone xiaomi = new Phone ("xiaomi", "mi8",2018, "black", 4, 3);

        Car fiat = new Car("Fiat", "Bravo", 2016, "red", 3.0) {
            @Override
            public void Refuel() {

            }
        };
        Car masserati = new Car("VW", "Passat", 2004, "black", 3.0) {
            @Override
            public void Refuel() {

            }
        };


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
        me.human = me;

        fiat.sale(me, brotherInLow, 8000.0);
        me.sale(me, brotherInLow, 300.0);

        Phone iphone = null;
        iphone.installAnApp("messenger");

        Disel audi = new Disel ("Audi", "sport", 2010, "red");
        LPG dacia = new LPG ("dacia", "duster", 2010, "black");
        Electric tesla = new Electric( "tesla", "m10", 2019, "white");

        List<String> apps = new ArrayList<>();
        apps.add("TikTok");
        apps.add("Instagram");
        apps.add("Facebook");
        iphone.installAnApp(apps);

        Human Anna = new Human();
        Human Krzysztof = new Human();
        Human Adrian = new Human();

        audi.value = 1000.0;
        dacia.value = 300.0;
        tesla.value = 1000.0;

        Anna.salary = 10000.0;
        Krzysztof.salary = 20000.0;
        Adrian.salary = 5000.0;

        Anna.addCar(audi);
        audi.carOwners();
        Krzysztof.addCar(tesla);
        tesla.carOwners();
        Adrian.addCar(dacia);
        dacia.carOwners();

        System.out.println("Byli wlasciciele" + audi.checkOwners());
        System.out.println("Byli wlasciciele" + dacia.checkOwners());
        System.out.println("Byli wlasciciele" + tesla.checkOwners());

        System.out.println("Transakcja sprzedazy" + audi.transactionCount());
        System.out.println("Transakcja sprzedazy" + dacia.transactionCount());
        System.out.println("Transakcja sprzedazy" + tesla.transactionCount());





    }
}

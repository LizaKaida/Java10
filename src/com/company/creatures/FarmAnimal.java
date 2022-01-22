package com.company.creatures;

import com.company.Human;

public class FarmAnimal extends Animal implements Edbile{
    boolean beEaten;

    public FarmAnimal(String species) {
        super (species);}

    @Override
    public void beEaten(Animal animal) {
        if(beEaten == false){
            System.out.println("Nie mozna zjesc");
        }else {
            System.out.println("Mozna zjesc");
        }

    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {

    }
}

package com.company;

import java.util.Objects;

public abstract class Animal implements Saleable{
    private static final Double DEFAULT_ANIMAL_WEIGHT = 6.0;
    public static final double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_CAT_WEIGHT = 1.0;
    String species;
    private Double weight;
    String name;
    Boolean isAlive;


    public Animal(String species) {
        this.species = species;
        this.isAlive = true;
        this.species = species;
        if (Objects.equals(this.species, "Canis")){
        this.weight = DEFAULT_DOG_WEIGHT; }
        else if (Objects.equals(this.species, "Puszek")){
            this.weight = DEFAULT_CAT_WEIGHT;}
        else { this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    void feed() {
        if (this.isAlive) {
            this.weight += 1;
            System.out.println("thx for food");
        } else {
            System.out.println("too later");
        }
            }

    public void takeForAWalk(){
        if (weight <=0){
            System.out.println("Nie ide na spacer");
            return;
        }
        weight--;
        if (weight >0){
            System.out.println("Moja waga to"+ weight);
        }else {
            System.out.println("Za duzo spacerowalem");
        }
    }
}





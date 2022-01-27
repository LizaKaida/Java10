package com.company.creatures;

import com.company.Saleable;

import java.util.Objects;

public abstract class Animal implements Saleable,Feedable {
    private static final Double DEFAULT_ANIMAL_WEIGHT = 6.0;
    public static final double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_CAT_WEIGHT = 1.0;
    public final String species;
    public Animal pet;
    protected Double weight;
    public String name;
    Boolean isAlive;


    public Animal(String species) {
        String species1;
        species1 = species;
        this.isAlive = true;
        species1 = species;
        this.species = species1;
        if (Objects.equals(this.species, "Canis")){
        this.weight = DEFAULT_DOG_WEIGHT; }
        else if (Objects.equals(this.species, "Puszek")){
            this.weight = DEFAULT_CAT_WEIGHT;}
        else { this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }

    public String getSpecies() {
        return species;
    }

    public Double getWeight() {
        return weight;
    }

    public void feed() {
        if (this.isAlive) {
            this.weight += 1;
            System.out.println("thx for food");
        } else {
            System.out.println("too later");
        }
            }
    public void feed(Double foodweight){
        if (weight <=0){
            System.out.println("nie bedzie jadl");
            return;
        }
        weight += foodweight;
        System.out.println("Waga to " + weight);
    }
    Double getweight(){
        return weight;
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





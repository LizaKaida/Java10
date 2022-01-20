package com.company;

public abstract class Human extends Animal {
    public boolean getSalary;
    String Human_Species = "homo sapiens";

    public String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    public Car car;
    Phone mobile;
   Animal pet;
   Human human;

   public Double getSalary(){
       return salary;}


    public Human() {
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 0.0;
    }
    public Human(String firstName){
       super("homo sapiens");
       this.firstName = firstName;
    }
    public void setSalary(Double salary) {
            this.salary = salary;

        }
        public void sale(Human seller, Human buyer, Double price){
       if(buyer.cash < price){
           System.out.println("nie masz $");}
       else if(seller.human != this){
           System.out.println("nie masz czlowieka");
       } else{
           System.out.println("nie wolno handlowac ludzmi");
       }
    }

}

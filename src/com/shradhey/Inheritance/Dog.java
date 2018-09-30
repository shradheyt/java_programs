package com.shradhey.Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name,  int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew()");
    }

    @Override
    public void eat() {
        chew();
    }
}

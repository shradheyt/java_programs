package com.shradhey.OOPSComplete;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","White","Sausage", 3.56);
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        price = hamburger.itemizeHamburger();
        System.out.println(price);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Broccoli", 2.5);
        System.out.println(healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("something", 2);
        System.out.println(db.itemizeHamburger());

    }
}

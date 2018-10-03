package com.shradhey.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health : "+ player.healthRemaining());
//
//        damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health : "+ player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("initial health is " + player.getHealth());
    }
}

package com.shradhey.Classes;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setCustomerName("Shradhey");
        myAccount.setCustomerEmailAddress("shradhey.tripathi@gmail.com");
        myAccount.deposit(100);
        myAccount.withdrawl(50);
    }
}

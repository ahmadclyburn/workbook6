package com.pluralsight.finance;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String name1, String accountNumber, double balance) {
        this.name = name1;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge(double amount ){
        this.balance -= amount;
    }
    public void pay(double amount ){
        this.balance += amount;
    }
    public double getValue(){
        return balance;
    }
}

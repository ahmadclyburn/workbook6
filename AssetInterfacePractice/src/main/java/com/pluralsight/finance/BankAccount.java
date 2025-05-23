package com.pluralsight.finance;

public class BankAccount implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
//        this.balance = this.balance + amount // longer form of line below
          this.balance += amount;
    }
    public void withdrawal(double amount ){
         this.balance -= amount;
    }
    public double getValue(){
        return balance;
    }
}

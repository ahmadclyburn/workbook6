package com.pluralsight.finance;

public class MainApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        BankAccount account2 = new BankAccount("456", "Gary", 1500);

        CreditCard account3 = new CreditCard("james", "1209",4500);
        CreditCard account4 = new CreditCard("mold","9837",8777);

        Gold account5 = new Gold("james", 12.5);
        House account6 = new House("jams",899.00, 2005, 1500, 2);
        Jewelry account7 = new Jewelry("marty", 98.00);
        account1.deposit(200.00);
        account2.withdrawal(890.00);
        account3.charge(98.00);
        account4.pay(89.00);
        account5.getValue();
        account6.getValue();
        account7.getValue();



    }
}

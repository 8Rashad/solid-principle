package org.example.D;

public class CreditCard implements BankCard {
    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction made with Credit Card");
    }
}

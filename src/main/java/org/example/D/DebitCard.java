package org.example.D;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction made with Debit Card");
    }
}

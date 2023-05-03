package org.example.D;

public class Store {
    private BankCard bankCard;

    public Store(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void doPayment(Object order, int amount) {
        bankCard.doTransaction(amount);
    }
}

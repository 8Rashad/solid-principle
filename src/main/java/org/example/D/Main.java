package org.example.D;

public class Main {
    public static void main(String[] args) {
    BankCard bankCard = new CreditCard();
    Store store = new Store(bankCard);
		store.doPayment("Some order", 5000);
}
}


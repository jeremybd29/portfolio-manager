package com.pluralsight;

public class CreditCard implements Valuable{
    private String owner;
    private double balance;
    private int cardNumber;

    public CreditCard(String owner, double balance, int cardNumber) {
        this.owner = owner;
        this.balance = balance;
        this.cardNumber = cardNumber;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    //add debt
    public void charge(double amount){
        balance += amount;
    }
    //pay off debt
    public void makePayment(double amount) {
        balance -= amount;
    }

    // The value of a credit card is negative because it represents money owed.
    @Override
    public double getValue(){
        return -balance;
    }
}

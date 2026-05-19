package com.pluralsight;

public class BankAccount implements Valuable {

    private String owner;
    private double balance;
    private int accountNumber;

    public BankAccount(String owner, double balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    @Override
    public double getValue(){
        return balance;
    }


}

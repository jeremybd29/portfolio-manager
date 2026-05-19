package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //create portfolio
        Portfolio portfolio =
                new Portfolio("John Cena's Portfolio");

        //house
        House house =
                new House("House", 250000, 1967, 3500, 3);

        //gold
        Gold gold = new Gold("Gold", 1500, 10);

        //jewelry
        Jewelry jewelry = new Jewelry("Jewelry", 5000, 14);

        //Bank Account
        BankAccount account = new BankAccount("John Cena", 10000, 123456);

        //deposit money
        account.deposit(5000);

        //credit card
        CreditCard card = new CreditCard("John Cena", 2000, 654321);

        //debt
        card.charge(500);

        //add assets to portfolio
        portfolio.add(house);
        portfolio.add(gold);
        portfolio.add(jewelry);
        portfolio.add(account);
        portfolio.add(card);

        // display portfolio value
        System.out.println("Total Portfolio Value: $" + portfolio.getValue());

        //display most valuable asset
        Valuable most = portfolio.getMostValuable();

        System.out.println("Most Valuable Asset: " + most.getValue());

        //display least valuable asset
        Valuable least = portfolio.getLeastValuable();

        System.out.println("Least Valuable Asset: " + least.getValue());

    }
}

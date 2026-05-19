package com.pluralsight;

import java.util.ArrayList;

public class Portfolio {

    private String owner;
    private ArrayList<Valuable> valuables;

    //constructor
    public Portfolio(String owner) {
        this.owner = owner;

        //intialize arraylist
        valuables = new ArrayList<>();
    }
    //getter
    public String getOwner(){
        return owner;
    }
    public void add(Valuable valuable){

        valuables.add(valuable);
    }
    //return all valuables
    public ArrayList<Valuable> getValuables() {
        return valuables;
    }
    //calculate  value of portfolio
    public double getValue(){

        double total = 0;

        //loop through all assets
        for (Valuable valuable : valuables) {
            total += valuable.getValue();
        }
        return total;
    }
    //return value of highest value asset
    public Valuable getMostValuable() {

        Valuable highest = valuables.get(0);

        for (Valuable valuable : valuables) {
            if (valuable.getValue() > highest.getValue()) {
                highest = valuable;
            }
        }
        return highest;
    }
    //return lowest value asset
    public Valuable getLeastValuable() {

        Valuable lowest = valuables.get(0);

        for (Valuable valuable : valuables) {
            if (valuable.getValue() < lowest.getValue()) {
                lowest = valuable;
            }
        }
        return lowest;
    }



}

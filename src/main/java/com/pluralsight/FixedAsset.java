package com.pluralsight;

public abstract class FixedAsset implements Valuable {

    private String name;
    private double marketValue;

    //constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
    //getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMarketValue() {
        return marketValue;
    }
    //setter
    public void setMarketValue(double value) {
        this.marketValue = value;
    }
    public abstract double getValue();




}

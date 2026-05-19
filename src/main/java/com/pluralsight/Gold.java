package com.pluralsight;

public class Gold extends FixedAsset{

    private double weight;

    //constructor
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }
    //getter
    public double getWeight() {
        return weight;
    }
    //setter
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double getValue() {
        return getMarketValue();
    }
}

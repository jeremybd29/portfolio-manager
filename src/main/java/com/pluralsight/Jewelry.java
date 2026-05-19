package com.pluralsight;

public class Jewelry extends FixedAsset{

    private double karat;

    //constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
    //getter
    public double getKarat() {
        return karat;
    }
    //setter
    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue(){
        return getMarketValue();
    }
}

package com.pluralsight;

public abstract class FixedAsset implements Valuable {

    private String name;
    private double value;

    //constructor
    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }
    //getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    //setter
    public void setValue(double value) {
        this.value = value;
    }




}

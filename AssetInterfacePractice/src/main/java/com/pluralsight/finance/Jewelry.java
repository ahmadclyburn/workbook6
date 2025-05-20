package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    private double karot;

    public Jewelry(String name , double karot) {
        super(name, 0);
        this.karot = karot;
    }
    @Override
    public double getValue(){
        double goldValue= karot * 500;
        return goldValue;
    }
}

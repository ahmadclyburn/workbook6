package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double weight) {
        super(name,0);
        this.weight = weight;
    }
    public double gold (double weight){
        return weight;
    }
    @Override
    public double getValue(){

        return(weight * 400);
    }
}

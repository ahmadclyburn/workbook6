package com.pluralsight.finance;

public abstract class FixedAsset {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.marketValue = value;
    }

    public abstract double getValue();
}

package com.booleanuk.core.Items;

public class Filling implements Item{


    private double price;
    private String ID;
    private Enum<FillingVariants> variant;

    public Filling(double price, Enum<FillingVariants> variant) {
        this.price = price;
        this.variant = variant;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getID() {
        return "";
    }

    @Override
    public String getVariant() {
        return "";
    }
}

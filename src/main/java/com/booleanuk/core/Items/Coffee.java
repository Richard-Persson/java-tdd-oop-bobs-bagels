package com.booleanuk.core.Items;

public class Coffee implements Item{


    private double price;
    private String ID;
    private Enum<CoffeeVariants> variant;

    public Coffee(){

    }

    public Coffee(double price, Enum<CoffeeVariants> variant) {
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

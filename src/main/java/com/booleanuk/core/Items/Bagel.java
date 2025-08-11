package com.booleanuk.core.Items;

import java.util.List;

public class Bagel implements Item{

    private List<Filling> fillings;

    private double price;
    private String ID;
    private Enum<BagelVariants> variant;

    public Bagel(){

    }

    public Bagel(double price, Enum<BagelVariants> variant){
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

package com.booleanuk.core.Items;

import static com.booleanuk.core.Items.CoffeeVariants.*;

public class Coffee implements Item{


    private double price;
    private String ID;
    private Enum<CoffeeVariants> variant;

    public Coffee(){

    }

    public Coffee(double price, Enum<CoffeeVariants> variant) {
        this.price = price;
        this.variant = variant;
        this.ID = setId(variant);
    }

    @Override
    public double getPrice() {
        return this.price ;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String getVariant() {
        return this.variant.name();
    }
    private String setId(Enum<CoffeeVariants> coffeeVariant){

        return          coffeeVariant.equals(BLACK)? "COFB" :
                        coffeeVariant.equals(WHITE)? "COFW":
                        coffeeVariant.equals(CAPUCCINO) ? "COFC" : "COFL";
    }
}

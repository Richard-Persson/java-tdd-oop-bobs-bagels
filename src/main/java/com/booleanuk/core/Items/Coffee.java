package com.booleanuk.core.Items;

import static com.booleanuk.core.Items.CoffeeVariants.*;

public class Coffee implements Item{


    private double price;
    private String ID;
    private Enum<CoffeeVariants> variant;

    public Coffee(){

    }

    public Coffee(Enum<CoffeeVariants> variant) {
        this.variant = variant;
        this.ID = setId(variant);
        this.price = setPrice(variant);
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
    public double setPrice(Enum<CoffeeVariants>variant){

        return variant.equals(BLACK) ? 0.99
                : variant.equals(WHITE) ? 1.19 : 1.29;
    }
    private String setId(Enum<CoffeeVariants> coffeeVariant){

        return          coffeeVariant.equals(BLACK)? "COFB" :
                        coffeeVariant.equals(WHITE)? "COFW":
                        coffeeVariant.equals(CAPUCCINO) ? "COFC" : "COFL";
    }
}

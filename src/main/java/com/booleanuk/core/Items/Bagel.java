package com.booleanuk.core.Items;

import java.util.List;

import static com.booleanuk.core.Items.BagelVariants.*;

public class Bagel implements Item{


    private double price;
    private String ID;
    private Enum<BagelVariants> variant;
    private Filling filling;

    public Bagel(){

    }

    public Bagel(Enum<BagelVariants> variant){
        this.variant = variant;
        this.price = setPrice(variant);
        this.ID = setId(variant);

    }

    public Filling getFilling() {
        return filling;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public double getPrice() {
        return this.price;
    }
    public double setPrice(Enum<BagelVariants> variant){
        return variant.equals(PLAIN) ? 0.39 : 0.49;
    }

    public String getID() {
        return this.ID;
    }

    public String getVariant() {
        return this.variant.name();
    }

    private String setId(Enum<BagelVariants> variant){

        return          variant.equals(ONION)? "BGLO" :
                        variant.equals(PLAIN)? "BGLP":
                        variant.equals(EVERYTHING) ? "BGLE" : "BGLS";
    }
}

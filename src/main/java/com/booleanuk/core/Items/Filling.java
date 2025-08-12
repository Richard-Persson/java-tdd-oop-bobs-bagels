package com.booleanuk.core.Items;

import static com.booleanuk.core.Items.FillingVariants.*;

public class Filling implements Item{


    private double price = 0.12;
    private String ID;
    private Enum<FillingVariants> variant;

    public Filling(Enum<FillingVariants> variant) {
        this.variant = variant;
        this.ID = setId(variant);
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String getVariant() {
        return this.variant.name();
    }


    private String setId(Enum<FillingVariants> fillingVariant){
            return
                              fillingVariant.equals(BACON)? "FILB"
                            : fillingVariant.equals(EGG)? "FILE"
                            : fillingVariant.equals(CHEESE)? "FILC"
                            : fillingVariant.equals(CREAM_CHEESE)? "FILX"
                            : fillingVariant.equals(SMOKED_SALMON)? "FILS":"FILH";
    }
}

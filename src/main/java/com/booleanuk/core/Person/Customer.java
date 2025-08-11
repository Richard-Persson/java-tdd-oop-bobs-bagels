package com.booleanuk.core.Person;

import com.booleanuk.core.Basket;
import com.booleanuk.core.Items.Item;

public class Customer extends Member {

    private Basket basket;

    public Customer(){

    }

    public double getTotalCost(){

        return 1;
    }


    public double getCostOfBagel(Item i){

        return 1;
    }

    public boolean chooseFilling(Item i){

        return false;
    }

    private double checkItemPrice(String ID){

        return 1;
    }
}

package com.booleanuk.core.Person;

import com.booleanuk.core.Basket;
import com.booleanuk.core.Items.Bagel;
import com.booleanuk.core.Items.Coffee;
import com.booleanuk.core.Items.Filling;
import com.booleanuk.core.Items.Item;

public class Customer extends Member {

    private Basket basket = new Basket();

    public Customer(){

    }

    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public double getTotalCost(){

        return basket.sum();
    }


    public double getCostOfBagel(Item i){

        if(i instanceof Coffee || i instanceof Filling)
            return 0;

        return basket.getItem(i).getPrice();
    }

    public boolean chooseFilling(Filling filling) {

        if (basket.getBagel() != null){
            basket.getBagel().setFilling(filling);
        return true;
    }

        return false;
    }

}

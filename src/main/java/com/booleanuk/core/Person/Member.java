package com.booleanuk.core.Person;

import com.booleanuk.core.Basket;
import com.booleanuk.core.Items.Item;

public class Member {


    private Basket basket;

    public Member(){

    }

    public Basket getBasket() {
        return null;
    }

    public void setBasket(Basket basket) {

    }

    public boolean addToBasket(Item i) {
        return true;
    }

    public boolean removeFromBasket(Item i) {
        return true;
    }

    public boolean isBasketFull() {
        return false;
    }
}

package com.booleanuk.core.Person;

import com.booleanuk.core.Basket;
import com.booleanuk.core.Items.Item;

public class Member {


    private Basket basket = new Basket();

    public Member(){
    }

    public Basket getBasket() {
        return this.basket;
    }

    public void setBasket(Basket basket) {

        this.basket = basket;
    }

    public boolean addToBasket(Item i) {
        printItemPrice(i);
        return this.basket.add(i);
    }

    public boolean removeFromBasket(Item i) {
        return this.basket.remove(i);
    }

    public boolean isBasketFull() {
        return this.basket.isFull();
    }

    private void printItemPrice(Item i){

        System.out.println(i.getPrice());
    }
}

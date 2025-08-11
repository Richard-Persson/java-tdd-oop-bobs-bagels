package com.booleanuk.core;

import com.booleanuk.core.Items.Item;

import java.util.List;

public class Basket {

    private int capacity = 4;

    private Inventory storeInventory;

    private List<Item> itemsInBasket;


    public Basket(){

    }

    public Basket(List<Item> itemsInBasket){
       this.itemsInBasket = itemsInBasket;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Inventory getStoreInventory() {
        return storeInventory;
    }

    public void setStoreInventory(Inventory storeInventory) {
        this.storeInventory = storeInventory;
    }

    public List<Item> getItemsInBasket() {
        return itemsInBasket;
    }

    public void setItemsInBasket(List<Item> itemsInBasket) {
        this.itemsInBasket = itemsInBasket;
    }

    public double sum(){

        return 1;
    }

    public double costOfBagel(String ID){

        return 1;
    }





}

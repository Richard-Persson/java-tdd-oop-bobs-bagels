package com.booleanuk.core;

import com.booleanuk.core.Items.Bagel;
import com.booleanuk.core.Items.Item;

import java.util.ArrayList;
import java.util.List;


public class Basket {

    public static int capacity = 8;

    private Inventory storeInventory;

    private List<Item> itemsInBasket = new ArrayList<>();


    public Basket(){

    }

    public int getCapacity() {
        return capacity;
    }

    public boolean setCapacity(int capacity) {
        if(capacity>0) {
            Basket.capacity = capacity;
            return true;
        }

        return false;
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
        double sum = 0;
        for (Item item : itemsInBasket) {
            sum+=item.getPrice();
        }

        return sum;

    }
    public boolean add(Item i)throws NullPointerException{
        if(i.getID() == null || i.getID().isEmpty() || i.getVariant().isEmpty() || i.getPrice()<=0)
            return false;

        return this.itemsInBasket.add(i);
    }

    public boolean remove(Item i){

        return this.itemsInBasket.remove(i);

    }

    public boolean isFull() {
        return this.itemsInBasket.size() == this.capacity;
    }

    public Item getItem(Item i){
        return i;
    }

    public double costOfBagel(Item i){

        return i.getPrice();
    }

    public Bagel getBagel(){

        for (Item i: this.itemsInBasket){
           if (i instanceof Bagel)
               return (Bagel)i;
        }

        return null;
    }





}

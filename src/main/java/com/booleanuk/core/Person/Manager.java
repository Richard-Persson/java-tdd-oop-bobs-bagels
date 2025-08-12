package com.booleanuk.core.Person;

import com.booleanuk.core.Basket;
import com.booleanuk.core.Inventory;
import com.booleanuk.core.Items.Item;

public class Manager extends Member{


    private Basket basket = new Basket();
    private Inventory inventory = new Inventory();


    public Manager(){

    }


    public boolean changeCapacity(int newCapacity){
        return basket.setCapacity(newCapacity);
    }

    public boolean addItemToStore(Inventory inventory,Item item, Integer quantity){
        return inventory.add(item,quantity);

    }



}

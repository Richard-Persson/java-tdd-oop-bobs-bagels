package com.booleanuk.core;

import com.booleanuk.core.Items.Item;

import java.util.HashMap;
import java.util.List;

public class Inventory {


    private HashMap<Item, Integer> items;

    public Inventory(HashMap<Item,Integer> items){

        this.items = items;
    }


    public List<Item> getAllItems(){

        return null;

    }

    public Item getSpecificItem(String ID){

        return null;
    }

    public int getQuantity(Item i){

        return 0;
    }







}

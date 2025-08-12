package com.booleanuk.core;

import com.booleanuk.core.Items.Bagel;
import com.booleanuk.core.Items.Coffee;
import com.booleanuk.core.Items.Filling;
import com.booleanuk.core.Items.Item;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static com.booleanuk.core.Items.BagelVariants.ONION;
import static com.booleanuk.core.Items.CoffeeVariants.BLACK;
import static com.booleanuk.core.Items.FillingVariants.CREAM_CHEESE;

public class Inventory {


    private HashMap<Item, Integer> items = new HashMap<>();
    private Set<Item> keys;

    public Inventory(){
        Item bagel = new Bagel(2.0, ONION);
        Item filling = new Filling(1.0,CREAM_CHEESE);
        Item coffee = new Coffee(3,BLACK);
        items.put(bagel,1);
        items.put(coffee,1);
        items.put(filling,1);
        this.keys = items.keySet();
    }

    public Inventory(HashMap<Item,Integer> items){

        this.items = items;
        this.keys = items.keySet();
    }


    public Set<Item> getAllItems(){

        return items.keySet();

    }

    public Item getSpecificItem(String ID){
        Item specificItem = null;
        for(Item item : keys){
            if(item.getID().equals(ID)) {
                specificItem = item;
                break;
            }
        }

        return specificItem;

    }

    public int getQuantity(Item i){

        return items.get(i);
    }
    public boolean add(Item item, int quantity){

        if(quantity<0)
            return false;

        if(items.containsKey(item)) {
            int oldQuantity = items.get(item);
            items.put(item,oldQuantity+quantity);
        }
        else{
           items.put(item,quantity);
        }
        keys = items.keySet();

        return true;

    }







}

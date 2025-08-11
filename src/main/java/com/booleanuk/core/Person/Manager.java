package com.booleanuk.core.Person;

import com.booleanuk.core.Basket;
import com.booleanuk.core.Items.Item;

public class Manager extends Member{


    private Basket basket;


    public Manager(){

    }


    public boolean changeCapacity(int newCapacity){

        return false;
    }

    public boolean addItemToStore(Item item){

        return false;
    }



}

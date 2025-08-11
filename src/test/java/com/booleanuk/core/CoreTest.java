package com.booleanuk.core;

import com.booleanuk.core.Items.*;
import com.booleanuk.core.Person.Customer;
import com.booleanuk.core.Person.Manager;
import com.booleanuk.core.Person.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.booleanuk.core.Items.BagelVariants.*;
import static com.booleanuk.core.Items.FillingVariants.*;
import static com.booleanuk.core.Items.CoffeeVariants.*;

public class CoreTest {

    private Inventory inventory;
    private Basket basketWithValidItems;
    private Item bagel = new Bagel(2.0, ONION);
    private Item filling = new Filling(1.0,CREAM_CHEESE);
    private Item coffee = new Coffee(3,BLACK);
    private Member member;
    private Customer customer;
    private Manager manager;


    @BeforeEach
    void setup(){

         member = new Member();
         customer = new Customer();
         manager = new Manager();

        bagel = new Bagel(2.0, ONION);
        filling = new Filling(1.0,CREAM_CHEESE);
        coffee = new Coffee(3,BLACK);
        basketWithValidItems = new Basket(List.of(bagel,filling,coffee));
        inventory = new Inventory(List.of(bagel,filling,coffee));
    }



    @Test
    void addToBasket(){

        member.addToBasket(bagel);
        Assertions.assertEquals(bagel,member.getBasket().getItemsInBasket().getFirst());

    }

    @Test
    void removeFromBasket(){

        member.setBasket(basketWithValidItems);
        member.removeFromBasket(bagel);
        Assertions.assertNotEquals(basketWithValidItems,member.getBasket());

    }



    @Test
    void basketIsFull(){

        Basket b = new Basket();

        b.setCapacity(1);
        member.setBasket(b);
        member.addToBasket(bagel);

        Assertions.assertTrue(member.isBasketFull());
    }


    @Test
    void getTotalCostOfBasket(){

        customer.setBasket(basketWithValidItems);
        Assertions.assertEquals(6, customer.getTotalCost());
    }

    @Test
    void getCostOfBagel(){



        Assertions.assertEquals(0,customer.getCostOfBagel(coffee));
        Assertions.assertEquals(2, customer.getCostOfBagel(bagel));
    }



    @Test
    void chooseFilling(){

        Assertions.assertTrue(customer.chooseFilling(filling));

    }



    @Test
    void changeCapacity(){

        Basket oldCapacity = new Basket();
        manager.changeCapacity(8);
        Basket newCapacity = new Basket();



        Assertions.assertEquals(4,oldCapacity.getCapacity());
        Assertions.assertEquals(8,newCapacity.getCapacity());
        Assertions.assertFalse(manager.changeCapacity(-1));
    }


    @Test
    void addItemToStore(){

        Item bagelEverything = new Bagel(0.49,EVERYTHING);
        Item bagelEverything2 = new Bagel(0.49,EVERYTHING);

        manager.addItemToStore(bagelEverything);

        Assertions.assertEquals(bagelEverything,inventory.getSpecificItem("BGLE"));
        Assertions.assertFalse(manager.addItemToStore(bagelEverything2));
    }


    @Test
    void getSumOfBasket(){

        Assertions.assertEquals(6,basketWithValidItems.sum());

    }


    @Test
    void getSpecificItem(){

        Assertions.assertTrue(inventory.getSpecificItem("COFB") == coffee);
        Assertions.assertNull(inventory.getSpecificItem("FILB"));
    }

}

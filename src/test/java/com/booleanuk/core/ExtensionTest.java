package com.booleanuk.core;

import com.booleanuk.core.Items.Bagel;
import com.booleanuk.core.Items.Coffee;
import com.booleanuk.core.Items.Filling;
import com.booleanuk.core.Items.Item;
import com.booleanuk.core.Person.Customer;
import com.booleanuk.core.Person.Manager;
import com.booleanuk.core.Person.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static com.booleanuk.core.Items.BagelVariants.ONION;
import static com.booleanuk.core.Items.BagelVariants.SESAME;
import static com.booleanuk.core.Items.CoffeeVariants.BLACK;
import static com.booleanuk.core.Items.FillingVariants.CREAM_CHEESE;

public class ExtensionTest {

    private Basket basketWithSixBagels;
    private Basket basketWithTwelveBagels;

    private Item bagel;
    private Item filling = new Filling(CREAM_CHEESE);
    private Item coffee = new Coffee(BLACK);

    private Member member;
    private Customer customer;
    private Manager manager;

    @BeforeEach
    void setup(){

        member = new Member();
        customer = new Customer();
        manager = new Manager();

        basketWithSixBagels = new Basket();
        basketWithTwelveBagels = new Basket();
    }


    @Test
    void basketWithDiscountBagel(){

        bagel = new Bagel(ONION);
        for (int i = 0; i <6 ; i++) {
            basketWithSixBagels.add(bagel);
        }
        bagel = new Bagel(SESAME);

        for (int i = 0; i <12 ; i++) {
            basketWithTwelveBagels.add(bagel);
        }
        double discountedPrice6 = basketWithSixBagels.sum();
        double discountedPrice12 = basketWithSixBagels.sum();
        Assertions.assertEquals(2.49,discountedPrice6);
        Assertions.assertEquals(3.99,discountedPrice12);

    }

    @Test
    void basketWithDiscountCoffeeAndBagel(){

    }
}

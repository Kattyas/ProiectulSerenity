package org.fasttrackit.features;

import org.junit.Test;

public class CartTest extends BaseTest{

//    private String productName = " Benie ";


    @Test
    public void addToCartTest(){
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
    }














}

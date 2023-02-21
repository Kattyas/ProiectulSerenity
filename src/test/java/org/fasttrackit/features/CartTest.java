package org.fasttrackit.features;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTest(){
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
    }














}

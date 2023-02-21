package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;


public class CartSteps extends BaseSteps{

    @Step
    public void navigateToShopPage(){
        homePage.clickShopField();
    }
    @Step
    public void selectProduct(){
        shopPage.clickOnBeanie();
    }
    @Step
    public void clickAddToCart() {
        productPage.clickAddToCartButton();
    }
    @Step
    public void verifyProductWasAddedToCart() {
        productPage.hasBeenProductAddedToCart();
    }

























}

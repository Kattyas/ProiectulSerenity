package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
        Assert.assertTrue(productPage.containsText( "“Beanie” has been added to your cart."));

    }

























}

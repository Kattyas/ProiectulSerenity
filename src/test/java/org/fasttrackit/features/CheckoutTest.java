package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkoutTest() {
        loginSteps.doLogin(Constants.USER_NAME, Constants.USER_PASS);
        cartSteps.navigateToShopPage();
        cartSteps.selectProduct();
        cartSteps.clickAddToCart();
        cartSteps.verifyProductWasAddedToCart();
        checkoutSteps.navigateToCart();
        checkoutSteps.clickToCheckout();
        checkoutSteps.placeOrder();
        checkoutSteps.verifyOrder();

    }


















}

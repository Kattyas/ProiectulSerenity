package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;







    public void proceedToCheckout(){
        clickOn(checkoutButton);
    }














}

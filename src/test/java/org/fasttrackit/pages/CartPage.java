package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;
    @FindBy(css = ".remove")
    private WebElementFacade removeButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade removeMessage;
    @FindBy(css = ".product-name a")
    private WebElementFacade checkProduct;







    public void proceedToCheckout(){
        clickOn(checkoutButton);
    }
    public void removeProduct(){
        clickOn(removeButton);
    }
    public void hasBeenProductRemoved() {
        removeMessage.shouldContainText("“Beanie” removed. Undo?");
    }
    public void isStillProductInCart(String product){
        checkProduct.shouldContainText(product);
    }














}

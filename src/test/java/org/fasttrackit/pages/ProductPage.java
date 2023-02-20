package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = ".cart button")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#primary > div.woocommerce-message")
    private WebElementFacade addedToCartMessage;





    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }

    public boolean hasBeenProductAddedToCart() {
        return addedToCartMessage.getText().equalsIgnoreCase( "“Beanie” has been added to your art.");
    }














}

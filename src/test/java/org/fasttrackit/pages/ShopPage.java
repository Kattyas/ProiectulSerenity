package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage{

    @FindBy(css = ".post-48 h2")
    private WebElementFacade selectBeanie;







    public void clickOnBeanie(){
        clickOn(selectBeanie);
    }







}

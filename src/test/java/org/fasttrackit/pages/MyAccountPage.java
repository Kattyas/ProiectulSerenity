package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{


    @FindBy(css = ".woocommerce-MyAccount-navigation-link--customer-logout a")
    private WebElementFacade logoutButton;

    @FindBy(css = ".woocommerce-MyAccount-navigation-link--edit-address a")
    private WebElementFacade addresses;





    public void clickLogoutButton(){
        clickOn(logoutButton);
    }

    public void clickAddresses(){
        clickOn(addresses);
    }




















}

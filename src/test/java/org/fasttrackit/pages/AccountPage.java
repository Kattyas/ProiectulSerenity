package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{


    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passwordField;

    @FindBy(id = "woocommerce-register-nonce")
    private WebElementFacade registerButton;






    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }






}

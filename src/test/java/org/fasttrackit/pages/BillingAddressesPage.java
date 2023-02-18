package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BillingAddressesPage extends BasePage{

    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNamefield;

    @FindBy(css = ".form-row-last .input-text")
    private WebElementFacade lastNameField;

    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade countrySelectField;

    @FindBy(css = "p #billing_address_1")
    private WebElementFacade streetAddressField;

    @FindBy(css = "p #billing_city")
    private WebElementFacade typeCityField;

    @FindBy(id = "billing_state")
    private WebElementFacade typeStateField;

    @FindBy(id = "billing_postcode")
    private WebElementFacade typePostcodeField;

    @FindBy(css = ".validate-phone input")
    private WebElementFacade typePhoneField;

    @FindBy(css = "#billing_email_field .input-text")
    private WebElementFacade typeEmailField;

    @FindBy(css = "p .button")
    private WebElementFacade clickSaveAddressButton;












}

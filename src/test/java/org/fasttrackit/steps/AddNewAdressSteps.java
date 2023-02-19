package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class AddNewAdressSteps extends BaseSteps{

    @Step
    public void navigateToMyAccount(){
        homePage.clickMyAccountField();
    }
    @Step
    public void typeUsername(String username) {
        accountPage.typeUsernameField(username);
    }
    @Step
    public void typePassword(String password) {
        accountPage.typePasswordField(password);
    }
    @Step
    public void clickLogin() {
        accountPage.clickLoginButton();
    }
    @Step
    public void clickAddresses(){
        myAccountPage.clickAddresses();
    }
    @Step
    public void clickBillingAddressEdit(){
        addressesPage.clickBillingAddress();
    }

    @Step
    public void typeFirstName(String firstname){
        billingAddressesPage.setFirstNameField(firstname);
    }
    
    @Step
    public void typeLastName(String lastname){
        billingAddressesPage.setLastNameField(lastname);
    }
    
    @Step
    public void typeCountry(String country){
        billingAddressesPage.setCountryField(country);
    }

// TODO: 19.02.2023 Street.... 






















}

package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToMyAccount(){
        homePage.clickMyAccountField();
    }

    @Step
    public void typeUserEmail(String email) {
        accountPage.setEmailField(email);
    }
    @Step
    public void typePassword(String password) {
        accountPage.setPasswordField(password);
    }

    @Step
    public void clickRegister() {
        accountPage.clickRegisterButton();
    }


















}

package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        loginSteps.navigateToMyAccount();
        loginSteps.typeUsername(Constants.USER_NAME);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn("a");
    }













}

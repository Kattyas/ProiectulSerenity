package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(css = "label .search-field")
    private WebElementFacade searchField;

    @FindBy(css = ".search-submit")
    private WebElementFacade searchButton;






















    public void setSearchField(String value) {
        typeInto(searchField, value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }













}

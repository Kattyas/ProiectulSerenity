package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchForProductTest(){
        searchSteps.searchForKeyword("NEW");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("NEW HAT");
    }
    @Test
    public void verifyAscendingPriceTest(){
        cartSteps.navigateToShopPage();
        searchSteps.goToSearchField();
        searchSteps.typeOnSearchField("sh");
        searchSteps.clickToSearch();
        searchSteps.sortProductsByPrice();
        searchSteps.productsAreSortedByAscendingPrice();
    }

























}

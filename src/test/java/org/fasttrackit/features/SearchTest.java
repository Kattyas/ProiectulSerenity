package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchForProductTest(){
        searchSteps.searchForKeyword("NEW");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("NEW HAT");



    }

























}

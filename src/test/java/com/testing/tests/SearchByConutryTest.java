package com.testing.tests;

import com.testing.browserconfig.BaseTest;
import com.testing.pages.SearchResultPage;
import com.testing.pages.WikipediaPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchByConutryTest {

    private WebDriver driver;
    private final String pageURL = "https://en.wikipedia.org/wiki/Main_Page";
    private final String browserName = "Chrome";

    @BeforeMethod
    public void setUp(){
        driver = BaseTest.configureBrowserDriver(browserName);
        driver.get(pageURL);
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "sampledata", dataProviderClass = com.testing.testdata.DataProvider.class)
    public void verifyCapital(String country, String expectedCapital){

        WikipediaPage wikipediaPage = new WikipediaPage(driver);
        SearchResultPage searchResultPage = wikipediaPage.searchByInput(country);
        String actualCapital = searchResultPage.getCapitalName();
        Assert.assertEquals(actualCapital, expectedCapital);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

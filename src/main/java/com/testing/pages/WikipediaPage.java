package com.testing.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {
    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[text()='Search']")
    private WebElement serchButton;
    private WebDriver driver;

    public WikipediaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage searchByInput(String input){
        searchInput.sendKeys(input);
        serchButton.click();
        return new SearchResultPage(driver);
    }
}

package com.framework.pages;

import com.framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends TestBase {


    @FindBy(name = "q")
    WebElement searchTexField;


    @FindBy(name = "btnK")
    WebElement googleSearchButton;


    // Initializing the Page Objects:
    public GoogleHomePage() {
        PageFactory.initElements(driver, this);
    }


    public GoogleHomePage enterKeyword(String keyword) throws InterruptedException {

        Thread.sleep(2000);

        searchTexField.sendKeys(keyword);

        Thread.sleep(2000);

        googleSearchButton.click();

        return new GoogleHomePage();
    }
}

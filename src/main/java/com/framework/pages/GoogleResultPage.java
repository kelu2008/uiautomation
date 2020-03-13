package com.framework.pages;

import com.framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage extends TestBase {

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div[1]/div/div[1]/a/h3")
    WebElement firstResult;


    // Initializing the Page Objects:
    public GoogleResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String firstResultText() {

        return firstResult.getText();

    }

}

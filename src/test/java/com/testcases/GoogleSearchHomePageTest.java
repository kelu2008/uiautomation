package com.testcases;

import com.framework.base.TestBase;
import com.framework.pages.GoogleHomePage;
import com.framework.pages.GoogleResultPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchHomePageTest extends TestBase {

	GoogleHomePage homePage;
	GoogleResultPage resultPage;

	public GoogleSearchHomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new GoogleHomePage();
		resultPage = new GoogleResultPage();

	}

	@Test
	public void searchKeywordTest() throws InterruptedException {

		homePage.enterKeyword("888spectate");
		Assert.assertTrue(resultPage.firstResultText().contains("888spectate"));
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}

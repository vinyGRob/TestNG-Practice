package tests;

import org.testng.annotations.Test;

import config.Setup;
import junit.framework.Assert;
import pageObjects.FakeLandingPage;
import pageObjects.UltimateQAHomePage;


public class UltimateQAActions extends Setup {

	@Test
	public void doSomething() throws InterruptedException {
		UltimateQAHomePage ultimateQAHomepage = new UltimateQAHomePage(driver);
		
		ultimateQAHomepage.enterText("whatever");
//		ultimateQAHomepage.clickSearch();
		
		ultimateQAHomepage.clickAnyLinkByText("Fake Pricing Page");
//		ultimateQAHomepage.clickLandingPageLink();
		Thread.sleep(2000);
		
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
		
		Assert.assertTrue("link not there", fakeLandingPage.verifySeleniumResourcesLink());
	}
}

package tests;

import org.testng.annotations.Test;

import config.Setup;
import junit.framework.Assert;
import pageObjects.FakeLandingPage;

public class FakeLandingPageActions extends Setup {
	
	@Test(enabled = false)
	public void fakeLandingPageTest() {
		FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
		
		Assert.assertTrue("link not there", fakeLandingPage.verifySeleniumResourcesLink());
	}

}

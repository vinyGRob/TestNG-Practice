package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.Setup;
import pageObjects.AutomationPracticeHomePage;
import pageObjects.SignInPage;
import pageObjects.WomenPage;

public class AutomationPracticeHomeActions extends Setup {
	
	@Test
	
	public void testCase() throws InterruptedException {
		AutomationPracticeHomePage automationPracticeHomePage = new AutomationPracticeHomePage(driver);
		automationPracticeHomePage.clickWomenLink();
		
		WomenPage wp = new WomenPage(driver);
		Assert.assertEquals(wp.getSceneTextP1(), "You will find here all woman fashion collections.");
 		Assert.assertEquals(wp.getSceneTextP2(), "This category includes all the basics of your wardrobe and much more:");
 		Assert.assertEquals(wp.getSceneTextP3(), "shoes, accessories, printed t-shirts, feminine dresses, women's jeans!");
 		wp.clickAnyLink("Sign in");
 		
 		SignInPage signIn = new SignInPage(driver);
 		Assert.assertTrue(signIn.verifyCreateAccountTitle(), "something went wrong");
 		signIn.enterEmail("vinyrobles@gmail.com");
 		signIn.clickCreateAccountBtn();
 		
 		Thread.sleep(2000);
 				
	}
	

}

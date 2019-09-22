package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.FakeLandingPageContent;

public class FakeLandingPage {
	
	private WebDriver driver;
	public FakeLandingPageContent fakeLandingPageContent;
	
	public FakeLandingPage(WebDriver webDriver) {
		driver = webDriver;
		fakeLandingPageContent = PageFactory.initElements(driver, FakeLandingPageContent.class);
	}
	
	public boolean verifySeleniumResourcesLink() {
		return fakeLandingPageContent.seleniumResourcesLink.isDisplayed();
	}

}

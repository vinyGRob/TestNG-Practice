package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FakeLandingPageContent {

	@FindBy(xpath = "//a[contains(text(),'Selenium Resources')]")
	public WebElement seleniumResourcesLink;
}

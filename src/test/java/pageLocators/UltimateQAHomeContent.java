package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UltimateQAHomeContent {
	@FindBy(id = "s")
    public WebElement searchField;
	
	@FindBy(id = "searchsubmit")
    public WebElement searchButton;
	
	@FindBy(xpath = "//a[contains(text(),'Fake Landing Page')]")
	public WebElement landingPageLink;
	
	
	
}

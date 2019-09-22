package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.UltimateQAHomeContent;


public class UltimateQAHomePage {
	private WebDriver driver;
	public UltimateQAHomeContent ultimateQAHomeContent;
	
	public UltimateQAHomePage(WebDriver webDriver) {
		driver = webDriver;
		ultimateQAHomeContent = PageFactory.initElements(driver, UltimateQAHomeContent.class);
	}
	
	public void enterText(String text) {
		ultimateQAHomeContent.searchField.sendKeys(text);
	}
	
	public void clickSearch() {
		ultimateQAHomeContent.searchButton.click();
	}
	
	public void clickLandingPageLink() {
		ultimateQAHomeContent.landingPageLink.click();
	}
	
	public void clickAnyLinkByText(String linkText) {
		driver.findElement(By.xpath("//a[contains(text(),'"+ linkText +"')]")).click();
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.HomeContent;


public class HomePage {
	private WebDriver driver;
	public HomeContent homeContent;
		
	public HomePage(WebDriver webDriver) {
		driver = webDriver;
		homeContent = PageFactory.initElements(driver, HomeContent.class);
	}
	
	public void enterValueInDisplay(String n){
		homeContent.display.sendKeys(n);
	}
	
	public String getValueFromDisplay(){
		return homeContent.display.getAttribute("value");
	}
	
	public void clickDivButton(){
		homeContent.divButton.click();
	}
	
	public void clickMultButton(){
		homeContent.multiplicationButton.click();
	}
	
	public void clickMinusButton(){
		homeContent.minusButton.click();
	}
	
	public void clickPlusButton(){
		homeContent.plusButton.click();
	}
	
	public void clickCalculateButton(){
		homeContent.calculateButton.click();
	}
	
	public void clickClearButton(){
		homeContent.clearButton.click();
	}
}


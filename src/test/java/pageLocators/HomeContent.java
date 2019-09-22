package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeContent {
	
	@FindBy(id = "input")
    public WebElement display;
	
	@FindBy(id = "BtnDiv")
    public WebElement divButton;
	
	@FindBy(id = "BtnMult")
    public WebElement multiplicationButton;

	@FindBy(id = "BtnMinus")
    public WebElement minusButton;
	
	@FindBy(id = "BtnPlus")
    public WebElement plusButton;
	
	@FindBy(id = "BtnCalc")
    public WebElement calculateButton;
	
	@FindBy(id = "BtnClear")
    public WebElement clearButton;

}

package pageObjects;

import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.WomenContent;

public class WomenPage {
	private WebDriver driver;
	public WomenContent  womenContent;
	
	public WomenPage(WebDriver webDriver) {
		driver = webDriver;
		womenContent = PageFactory.initElements(driver, WomenContent.class);
		
	}

	public String getSceneTextP1() {
		return womenContent.womenContentSceneP1.getText();
	}
	
	public String getSceneTextP2() {
		return womenContent.womenContentSceneP2.getText();
	}
	
	public String getSceneTextP3() {
		return womenContent.womenContentSceneP3.getText();
	}
	
	public void clickAnyLink(String linkTxt) {
		driver.findElement(By.xpath("//a[contains(text(),'"+linkTxt+"')]")).click();
		
	}
}

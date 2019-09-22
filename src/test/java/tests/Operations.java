package tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import config.CSVReader;
import config.Setup;
import pageObjects.HomePage;

/**
 * @author cristian.gonzalez
 *
 */
public class Operations extends Setup{
	
	@Test(enabled = false)
	public void operationTests() throws InterruptedException {
		String n1, n2, expectedResult;
		CSVReader csvReader = new CSVReader();
		List<String> csvValues = csvReader.getValuesFromCSV();
		for(int i=4;i<csvValues.size();i=i+4){
			n1 = csvValues.get(i);
			n2 = csvValues.get(i+1);
			expectedResult = csvValues.get(i+3);
			
			HomePage homePage = new HomePage(driver);
			homePage.clickClearButton();
			homePage.enterValueInDisplay(n1);
			if (csvValues.get(i+2).toUpperCase().equals("ADDITION")){
				homePage.clickPlusButton();
			}
			if (csvValues.get(i+2).toUpperCase().equals("DIVISION")){
				homePage.clickDivButton();
			}
			if (csvValues.get(i+2).toUpperCase().equals("MULTIPLICATION")){
				homePage.clickMultButton();
			}
			if (csvValues.get(i+2).toUpperCase().equals("SUBTRACTION")){
				homePage.clickMinusButton();
			}
								
			homePage.enterValueInDisplay(n2);
			homePage.clickCalculateButton();
			Thread.sleep(2000);
			Assert.assertEquals(homePage.getValueFromDisplay(),expectedResult,"Results are not matching:");
		}
		
	}
}

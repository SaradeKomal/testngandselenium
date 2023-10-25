package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.CommonMethods;
import pageObjectModel.loginpageObject;

public class VerifyLogin extends BaseClass{
	 

	 @Test
	 public void login() throws IOException {
	  
	 // initializeDriver() ;
	 // driver.get("https://login.salesforce.com/");//this driver is not null and its having scope
	  loginpageObject LPO=new loginpageObject(driver);
	  LPO.enterUsername().sendKeys("rahul");
	  LPO.enterPassword().sendKeys("123");
	  LPO.clickLogin().click();
	  
	  
	  //Soft assertion
	  String actualText=LPO.errorText().getText();
	  String expectedText="please check your username";
	  CommonMethods.handelassertion(expectedText, actualText, "error message is not valid");
	 /* SoftAssert assertion=new SoftAssert();
	  assertion.assertEquals(actualText, expectedText, "Error message is not valid");
	  
	  assertion.assertAll();*/
	 }
	 }

	 
	 
	 


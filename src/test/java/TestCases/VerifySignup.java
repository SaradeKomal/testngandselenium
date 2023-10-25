package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.CommonMethods;
import pageObjectModel.SignuppageObject;
import pageObjectModel.loginpageObject;

public class VerifySignup extends BaseClass{
	@Test
	public void signup() throws IOException, InterruptedException {
		  //initializeDriver() ;
		  //driver.get("https://login.salesforce.com/");
		  loginpageObject LPO=new loginpageObject(driver);
		  LPO.clickOnTryforfree().click();
		  
		  SignuppageObject SPO=new SignuppageObject(driver);
		  Thread.sleep(5000);
		  SPO.firstName().sendKeys("hello");
		  SPO.lastName().sendKeys("helo");
		  
		  CommonMethods.handeldropdown(SPO.selectEmployee(), 1);
		  
		  /*Select s=new Select(SPO.selectEmployee());
		  s.selectByIndex(1);*/
		  
	}

}

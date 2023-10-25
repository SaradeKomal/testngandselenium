package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageObject {
	public WebDriver driver;  //This driver is null--dont have scope
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	private By errortext=By.xpath("//div[@id='error']");
	
	//this is one comment adding for git demo purpose
	
	public loginpageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterUsername() {
	return driver.findElement(username);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
		}
	public WebElement clickLogin() {
		return driver.findElement(login);
		}
	public WebElement clickOnTryforfree() {
		
	return driver.findElement(tryforfree);
	}
	public WebElement errorText() {
		
		return driver.findElement(errortext);
		}

}

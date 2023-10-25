package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignuppageObject {
	public WebDriver driver;
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By jobtitle=By.xpath("//input[@name='UserTitle']");
	By email=By.xpath("//input[@name='UserEmail']");
	By employees=By.xpath("//select[@name='CompanyEmployees']");
	
	
	
	
	
	public SignuppageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement firstName() {
		return driver.findElement(firstname);
		}
	public WebElement lastName() {
		return driver.findElement(lastname);
		}
	public WebElement jobTitle() {
		return driver.findElement(jobtitle);
		}
	public WebElement eMail() {
		return driver.findElement(email);
		}
	public WebElement selectEmployee() {
		return driver.findElement(employees);
		}

}

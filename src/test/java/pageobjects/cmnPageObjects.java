package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cmnPageObjects {
	
	WebDriver driver;
	
	// Constructor to initialize driver
	public cmnPageObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	// By Locators
	private By search_text_box = By.id("twotabsearchtextbox");
	private By search_button = By.xpath("//input[@value='Go']");
	
	
	// Locators methods 
	
	public void SetSearchTextBox(String text)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40000);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(search_text_box));
		element.sendKeys(text);
	}
	
	public void ClickOnSearchButton()
	{
		driver.findElement(search_button).click();
	}

}

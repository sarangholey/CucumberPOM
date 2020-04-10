package pageobjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class searchPageObjects {

	WebDriver driver;
	
	// Constructor to initialize driver
	public searchPageObjects(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// By Locators
	private By product_list = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");
		
	// Locators methods 
	public void ValidateProductList(String productName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40000);
		List<WebElement> list_products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(product_list));
		//List<WebElement> list_products =  driver.findElements(product_list);
		
		for(int i=0;i<list_products.size();i++)
		{
			//System.out.println(list_products.get(i).getText());
			String temp = list_products.get(i).getText().toLowerCase();
			if(temp.contains(productName.toLowerCase()))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail("Product not correctly displayed in the search result. Product at index: " + (i+1));
			}
		}
	}
	
}

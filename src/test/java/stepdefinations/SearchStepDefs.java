package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.cmnPageObjects;
import pageobjects.searchPageObjects;

public class SearchStepDefs {
	
	String url = "https://www.amazon.in";
	WebDriver driver = null;
	
	cmnPageObjects cmnPageObj;
	searchPageObjects searchPageObj;
	
	@Given("I have browser opened and url is navigated")
	public void i_have_browser_opened_and_url_is_navigated() {
	    driver  =  new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MICROSECONDS);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get(url);
	}

	@When("I search for product {string}")
	public void i_search_for_product(String product) {
		
		cmnPageObj = new cmnPageObjects(driver);
		cmnPageObj.SetSearchTextBox(product);
		cmnPageObj.ClickOnSearchButton();
		
		/*
		 * WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		 * searchbox.sendKeys(product);
		 * 
		 * WebElement searchbutton =
		 * driver.findElement(By.xpath("//input[@value='Go']")); searchbutton.click();
		 */
	}

	@Then("product list should appear pertaining to the product search as {string}")
	public void product_list_should_appear_pertaining_to_the_product_search_as(String productName) {
		
		searchPageObj = new searchPageObjects(driver);
		searchPageObj.ValidateProductList(productName);
		
		/*
		 * WebElement productDescription = driver.findElement(By.
		 * xpath("//span[@class='a-size-medium a-color-base a-text-normal']")); String
		 * description = productDescription.getText();
		 * 
		 * if(description.contains(productName)) { Assert.assertTrue(true); } else {
		 * Assert.assertFalse("Product not correctly displayed in the search result",
		 * true); }
		 */
		
	}
	
	@After
	public void CleanUp()
	{
		driver.quit();
	}

}

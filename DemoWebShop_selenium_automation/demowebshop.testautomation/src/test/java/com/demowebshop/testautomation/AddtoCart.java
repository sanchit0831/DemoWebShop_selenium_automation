package com.demowebshop.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCart {
	
	WebDriver driver = Hooks.driver;
	
	@Given("user clicks on gift cart button and navigates to gift card page")
	public void user_clicks_on_gift_cart_button_and_navigates_to_gift_card_page() throws InterruptedException {
        
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        
        WebElement add_cart1 = driver.findElement(By.linkText("$25 Virtual Gift Card"));
		add_cart1.click();
		Thread.sleep(2000);
	}

	@And("user enters gift card details")
	public void user_enters_gift_card_details() 
			throws InterruptedException {
		
		WebElement rname = driver.findElement(By.id("giftcard_2_RecipientName"));
		rname.sendKeys("Ravi Kumar");
		Thread.sleep(2000);
		
		WebElement remail = driver.findElement(By.id("giftcard_2_RecipientEmail"));
		remail.sendKeys("ravikumar@gmail.com");
		Thread.sleep(2000);
		
		WebElement rmsg = driver.findElement(By.id("giftcard_2_Message"));
		rmsg.sendKeys("Happy Birthday!!");
		Thread.sleep(2000);
		
		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		qty.clear();
		qty.sendKeys("5");
		Thread.sleep(2000);
		
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		WebElement add1 = driver.findElement(By.id("add-to-cart-button-2"));
		add1.click();
		Thread.sleep(2000);
	}

	@Then("gift card is added to cart")
	public void gift_card_is_added_to_cart() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/cart");
		Thread.sleep(2000);
	}

}

package com.demowebshop.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrder {
	WebDriver driver = Hooks.driver;
	
	@Given("user clicks cart button")
	public void user_clicks_cart_button() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/cart");
		Thread.sleep(2000);
	}

	@And("user accepts terms and condition and clicks checkout")
	public void user_accepts_terms_and_condition_and_clicks_checkout() throws InterruptedException {
		
		WebElement t_and_c = driver.findElement(By.name("termsofservice"));
		t_and_c.click();
		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.name("checkout"));
		checkout.click();
		Thread.sleep(2000);
	}

	@When("user enters billing company, country, city, address, zip code, phno")
	public void user_enters_billing_company_country_city_address_zip_code_phno() throws InterruptedException {
		
		WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
		company.sendKeys("TCS");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		country.sendKeys("India");
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
		city.sendKeys("Pune");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("BillingNewAddress_Address1"));
		address.sendKeys("Hadapsar");
		Thread.sleep(2000);
		
		WebElement code = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		code.sendKeys("411028");
		Thread.sleep(2000);
		
		WebElement phno = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		phno.sendKeys("8732145231");
		Thread.sleep(2000);
	}

	@And("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		WebElement continue1 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/input[1]"));
		continue1.click();
		Thread.sleep(4000);
		
		WebElement continue2 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[2]/div[2]/div[1]/input[1]"));
		continue2.click();
		Thread.sleep(4000);
		
		WebElement continue3 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/div[1]/input[1]"));
		continue3.click();
		Thread.sleep(4000);
		
		WebElement continue4 = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[2]/input[1]"));
		continue4.click();
		Thread.sleep(4000);
	}

	@Then("order is placed")
	public void order_is_placed() throws InterruptedException {
		WebElement odetail = driver.findElement(By.linkText("Click here for order details."));
		odetail.click();
		Thread.sleep(2000);
	}
}

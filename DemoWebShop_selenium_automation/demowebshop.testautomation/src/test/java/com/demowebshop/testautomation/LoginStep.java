package com.demowebshop.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	WebDriver driver = Hooks.driver;
	
	@Given("user click login button and navigates to login page")
	public void user_click_login_button_and_navigates_to_login_page() throws InterruptedException {
		WebElement log = driver.findElement(By.linkText("Log in"));
		log.click();
		Thread.sleep(2000);
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_email_and_password(String email, String password) throws InterruptedException {

		WebElement e1 = driver.findElement(By.id("Email"));
		e1.sendKeys(email);
		Thread.sleep(2000);
		
		WebElement p1 = driver.findElement(By.id("Password"));
		p1.sendKeys(password);
		Thread.sleep(2000);
		
		WebElement check = driver.findElement(By.id("RememberMe"));
		check.click();
		Thread.sleep(2000);
	}

	@And("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		WebElement log_btn = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]"));
		log_btn.click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		System.out.println(driver.getCurrentUrl());
	}	
}

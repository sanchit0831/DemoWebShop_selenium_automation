package com.demowebshop.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {

	WebDriver driver = Hooks.driver;
	
	@Given("user click register button and navigates to registration page")
	public void user_click_register_button_and_navigates_to_registration_page() throws InterruptedException {
		WebElement reg_link = driver.findElement(By.linkText("Register"));
		reg_link.click();
		Thread.sleep(2000);
	}

	@When("^user enters (.*), (.*), (.*), (.*) and (.*)$")
	public void user_enters_gender_email_password_name_and_lname
	 		(String gender, String email, String password, String name, String lname) 
			throws InterruptedException {
		
			if (gender.equalsIgnoreCase("male")) {
				WebElement male = driver.findElement(By.id("gender-male"));
				male.click();
				Thread.sleep(2000);
			}
			else {
				WebElement female = driver.findElement(By.id("gender-female"));
				female.click();
				Thread.sleep(2000);
			}
			
			WebElement firstname = driver.findElement(By.id("FirstName"));
			firstname.sendKeys(name);
			Thread.sleep(2000);
			
			WebElement lastname = driver.findElement(By.id("LastName"));
			lastname.sendKeys(lname);
			Thread.sleep(2000);
			
			WebElement email1 = driver.findElement(By.id("Email"));
			email1.sendKeys(email);
			Thread.sleep(2000);
			
			WebElement password1 = driver.findElement(By.id("Password"));
			password1.sendKeys(password);
			Thread.sleep(2000);
			
			WebElement password2 = driver.findElement(By.id("ConfirmPassword"));
			password2.sendKeys(password);
			Thread.sleep(2000);
	}

	@And("user clicks register button")
	public void user_clicks_register_button() throws InterruptedException {
		WebElement reg_btn = driver.findElement(By.name("register-button"));
		reg_btn.click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to account created successfully page")
	public void user_is_navigated_to_account_created_successfully_page() throws InterruptedException {
		WebElement cont = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/input[1]"));
		cont.click();
		Thread.sleep(2000);
	}

	@And("user can log out successfully")
	public void user_can_log_out_successfully() throws InterruptedException {
		WebElement lout = driver.findElement(By.linkText("Log out"));
		lout.click();
		Thread.sleep(2000);
	}
}

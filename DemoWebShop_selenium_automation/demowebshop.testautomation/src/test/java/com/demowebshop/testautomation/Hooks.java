package com.demowebshop.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

public static WebDriver driver;
	
	// Static counter to keep track of scenario executions
	private static int scenarioCount = 0;
	
	// Set this to the total number of scenarios
	private static int totalScenarios = 4;
	
	@Before
	public void setUp(Scenario scenario) {
		// Launch the browser if it’s not already open
		if (driver == null) {
			System.out.println("Opening the browser...");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		// You can add more setup steps based on specific scenarios
		if (scenario.getName().equals("Account registration")) {
			driver.get("https://demowebshop.tricentis.com/"); // Setyour login page URL
		}
	}
	
	
	@After
	public void tearDown(Scenario scenario) {
		scenarioCount++; // Increment the counter after each scenario
		
		// Only close the browser after the last scenario is executed
		if (scenarioCount >= totalScenarios) {
			System.out.println("Closing the browser after the last scenario...");
			driver.quit();
		} 
		else {
			System.out.println("Browser will remain open for the next scenario.");
		}
	}
	
}

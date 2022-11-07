package org.fblogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBStepDef {
	WebDriver driver;
	
	@Given("User should be in facebook login page")
	public void user_should_be_in_facebook_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("manoj");
		driver.findElement(By.id("pass")).sendKeys("manoj@123");
		
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		driver.findElement(By.name("pass")).click();
		
	}

	@Then("User should verify the sucess message")
	public void user_should_verify_the_sucess_message() {
		System.out.println("login successfull");
		
	}

}

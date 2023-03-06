package com.stepdefinition;

import org.openqa.selenium.By;

import com.baseclass.Base_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class{
	
	@Given("User Launch the url")
	public void user_launch_the_url() {
		
		initiateBrowser("chrome");
		
		getUrl("https://www.facebook.com/login/");

	}

	@When("User enter the facebook username")
	public void user_enter_the_facebook_username() {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Sabari123@gmail.com");
	
	}

	@When("User enter the facebook password")
	public void user_enter_the_facebook_password() {
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234567890");
	
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("User see the next page")
	public void user_see_the_next_page() {
		
		System.out.println("Next Page");
	
	}
	
	@When("User enter the facebook username  {string}")
	public void user_enter_the_facebook_username(String string) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(string);
		Thread.sleep(2000);
	}

	@When("User enter the facebook password {string}")
	public void user_enter_the_facebook_password(String string) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(string);
		Thread.sleep(2000);
	}
	
}
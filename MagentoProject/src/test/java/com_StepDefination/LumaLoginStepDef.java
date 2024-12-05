package com_StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com_PageObjects.Luma_LoginPageObjects;
import io.cucumber.java.en.*;


public class LumaLoginStepDef {
	
	public static WebDriver driver;
	
	Luma_LoginPageObjects alp;
	
	@Given("user open browser")
	public void user_open_browser() {
		
		driver=new ChromeDriver(); 
	}

	@And("user open the application")
	public void user_open_the_application() {
	
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//@When("user enters username and password")
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
	    
		
		alp=new Luma_LoginPageObjects(driver);
		
		alp.signinlink.click();
		alp.signinemailtextfield.sendKeys(username);
		alp.signinpasswordtextfield.sendKeys(password);
		
		
	}

	@And("user clicks the login button")
	public void user_clicks_the_login_button() {
	    
		alp.signinbutton.click();
		
//		alp.ClickLoginButton();
	}

	@Then("user should succussfully completed the login functionality")
	public void user_should_succussfully_completed_the_login_functionality() {
		
		System.out.println("login functionality successfully completed");
	   
	}

	

}

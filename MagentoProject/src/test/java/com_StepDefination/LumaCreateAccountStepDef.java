package com_StepDefination;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com_PageObjects.Luma_CreateAccountPageObjects;
import com_PageObjects.Luma_LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LumaCreateAccountStepDef {

public static WebDriver driver;
	
	Luma_CreateAccountPageObjects alp;
	
	@Given("If user is on homepage")
	public void if_user_is_on_homepage() {
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//verify the create an account link on homepage
		assertTrue(alp.createaccountlink.isDisplayed());
	    
	}
	@When("click on signup link")
	public void click_on_signup_link() {
		//click the create an account link
		alp.createaccountlink.click();
	}
	@When("enter valid personal information")
	public void enter_valid_personal_information() {
	    //enter valid data in text fields
		alp.firstnametextfield.sendKeys("Mohammed");
		alp.lastnametextfield.sendKeys("Shafi");
		alp.emailtextfield.sendKeys("shafeemohd333@gmail.com");
		alp.passwordtextfield.sendKeys("Shafi@123");
		alp.confrmpasswordtextfield.sendKeys("Shafi@123");
		
	}
	@When("click create an account button")
	public void click_create_an_account_button() {
		//click create an account button 
		alp.createaccountbutton.click();
	}
	@Then("verify user should create an account successfully")
	public void verify_user_should_create_an_account_successfully() {
//		Thank you for registering with Main Website Store.
		//verify success message
		assertEquals(alp.successmessage.getText(),"Thank you for registering with Main Website Store.");
		driver.close();
	}
	
}

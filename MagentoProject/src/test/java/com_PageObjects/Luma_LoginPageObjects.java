package com_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Luma_LoginPageObjects extends Luma_BaseObjectClass {
	

	//1.Constructor
	
        public WebDriver driver;
        
        public Luma_LoginPageObjects(WebDriver driver) {
        	
        	super(driver);
        }
        
        
    //2. identify the webelements
        
    	@FindBy(xpath="(//a[contains(text(),'Sign In')])[1]") public WebElement signinlink;
    	@FindBy(xpath="//input[@id='email']") public WebElement signinemailtextfield;
    	@FindBy(xpath="(//input[@type='password'])[1]") public WebElement signinpasswordtextfield;
    	@FindBy(xpath="(//span[text()='Sign In'])[1]") public WebElement signinbutton;
        
        
        
 

      
}

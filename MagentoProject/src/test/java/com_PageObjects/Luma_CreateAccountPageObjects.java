package com_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Luma_CreateAccountPageObjects extends Luma_BaseObjectClass {
	

	//1.Constructor
	
        public Luma_CreateAccountPageObjects(WebDriver driver) 
        {
        	super(driver);
		
        }

        
        
    //2. identify the webelements
        
        @FindBy(xpath="(//a[text()='Create an Account'])[1]") public WebElement createaccountlink;
    	@FindBy(xpath="//input[@id='firstname']") public WebElement firstnametextfield;
    	@FindBy(xpath="//input[@id='lastname']") public WebElement lastnametextfield;
    	@FindBy(xpath="//input[@id='email_address']") public WebElement emailtextfield;
    	@FindBy(xpath="//input[@id='password']") public WebElement passwordtextfield;
    	@FindBy(xpath="//input[@id='password-confirmation']") public WebElement confrmpasswordtextfield;
    	@FindBy(xpath="(//span[text()='Create an Account'])[1]") public WebElement createaccountbutton;
    	@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']") public WebElement successmessage;
    	
        
        
        
 

      
}

package com_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Luma_BaseObjectClass {
	//open application,close application, screenshots
	
      //1.Constructor
	
	   public WebDriver driver;
	   public Luma_BaseObjectClass(WebDriver driver) {
		   
		  this.driver=driver;
		  
		  PageFactory.initElements(driver, this); 
	   }

}

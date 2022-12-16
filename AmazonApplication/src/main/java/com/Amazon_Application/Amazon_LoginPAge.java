package com.Amazon_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPAge {

	
	public Amazon_LoginPAge(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	  }
       
	   @FindBy(xpath = "//input[@id='ap_email']")
	   private WebElement userName;
	
	   @FindBy(xpath = "//input[@id='continue']")
	   private WebElement continue_click;
	   
	   @FindBy(xpath = "//input[@id='ap_password']")
	   private WebElement passWord;
	   
	   @FindBy(xpath = "//input[@id='signInSubmit']")
	   private WebElement Login_btn;

       
       public void enterUserName() 
        {
    	  userName.sendKeys("9022274736");
        }
       
       public void clickOncontinue_click() 
        {
   	     continue_click.click();
        }
       
       public void enterPassword() 
        {
    	  passWord.sendKeys("Atul@4003");
        }
       
      public void clickOnLoginBtn() 
        {
    	  Login_btn.click();
        }
    }



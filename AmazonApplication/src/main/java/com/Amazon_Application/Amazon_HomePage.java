package com.Amazon_Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Amazon_HomePage {
	
	public Amazon_HomePage(WebDriver driver){
		
	       PageFactory.initElements(driver,this);
	}
	
	//declaration and Initialization
	@FindBy(xpath ="//a[@id='nav-logo-sprites']")
	private WebElement home_tab;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement serching_Tab;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement serching_Logo;
	
	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_0']")
	private WebElement todays_Deals;
	
	@FindBy (xpath = "//i[@class='a-icon a-icon-next']")
	private WebElement right_click;
	
	@FindBy(xpath ="//span[@class='nav-cart-icon nav-sprite']" )
	private WebElement Add_Cart;
	
	@FindBy(xpath = "//span[@class='icp-nav-flag icp-nav-flag-us icp-nav-flag-discoverability-t1']")
	private WebElement change_Lang;
	
	@FindBy(xpath = "//span[@class='a-button-text a-declarative']")
	private WebElement currency_Settings;
	
	@FindBy(xpath = "//span[@style='unicode-bidi:isolate; direction:ltr;']")
	private WebElement india;
	
	//usage
	public void clickOnHome() 
	{
		home_tab.click();
	}
	public void clickOnserching_Tab() 
	{
		serching_Tab.sendKeys("iqoo z6 pro 5g mobile phone");
	}
	public void clickonSerching_Logo() 
	{
		serching_Logo.click();
	}
	public void click_Todays_Deals() 
	{
		todays_Deals.click();
	}
	public void click_right_click() 
	{
		right_click.click();
	}
	public void clickOn_Add_Cart() 
	{
		Add_Cart.click();
	}
	public void clickOn_change_Lang() 
	{
		change_Lang.click();
	}
	public void clickOn_currency_Settings() 
	{
		currency_Settings.click();
		Select s = new Select(currency_Settings); 
		s.deselectByIndex(42);
	}
	public void setThe_india() 
	{
		india.click();
		
	}
}

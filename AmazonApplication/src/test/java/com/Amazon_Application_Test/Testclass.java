package com.Amazon_Application_Test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

//import org.openqa.selenium.support.ui.Select;
// import org.testng.annotations.Test;
import com.Amazon_Application.Amazon_HomePage;
import com.Amazon_Application.Amazon_LoginPAge;

public class Testclass {

    @Test	
	public void Atul() throws InterruptedException, IOException {
    	
    	// public static void main(String []args) throws InterruptedException, IOException {
		
    	// Lunch the Browser
		System.setProperty("webdriver.gecko.driver","D:\\Software\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=W46NWFTDP2R8TFAYMW4S&openid.assoc_handle=usflex&openid.mode=checkid_setup&failedSignInCount=0&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//***********************************************************************************************	
		
		//LoginPage Object
		Amazon_LoginPAge obj= new Amazon_LoginPAge(driver);
		Thread.sleep(2000);
		obj.enterUserName();
		Thread.sleep(2000);
		obj.clickOncontinue_click();
		Thread.sleep(2000);
		obj.enterPassword();
		Thread.sleep(2000);
		obj.clickOnLoginBtn();
		
		// Create HomePage Object
		Amazon_HomePage h= new Amazon_HomePage(driver);
		h.clickOnHome();
		Thread.sleep(2000);
		
		// home Page Screenshot
	           File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               String path="H:\\Selenium ScrennShot\\Home_Page.png";
               File destination= new File(path);
               FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		h.clickOnserching_Tab();
		Thread.sleep(2000);
		h.clickonSerching_Logo();
		Thread.sleep(2000);
		
		// Serching_Mobile Page Screenshot
			 	File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        String path1="H:\\Selenium ScrennShot\\Serching-mobile.png";
		        File destination1= new File(path1);
		        FileHandler.copy(source1, destination1);
		
		Thread.sleep(4000);
		h.click_Todays_Deals();
		Thread.sleep(3000);
		
		// Todays_deals Page Screenshot
	 	       File source2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               String path2="H:\\Selenium ScrennShot\\Todats_Deals.png";
               File destination2= new File(path2);
               FileHandler.copy(source2, destination2);
		Thread.sleep(4000);
		// Scroll up
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,200)");
		Thread.sleep(4000);
		h.click_right_click();
		Thread.sleep(2000);
		h.clickOn_Add_Cart();
		Thread.sleep(4000);
		
		// Add to cart Page Screenshot
	          File source3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
              String path3="H:\\Selenium ScrennShot\\Add_To-cart.png";
              File destination3= new File(path3);
              FileHandler.copy(source3, destination3);
             
        Thread.sleep(2000);
        h.clickOnHome();      
        Thread.sleep(2000);
        h.clickOn_change_Lang();
        Thread.sleep(2000);
         // scroll the page
        js.executeScript("scroll(0,400)");
        Thread.sleep(2000);
      //  h.clickOn_currency_Settings();
       // Thread.sleep(2000);
     
        // js.executeScript("scroll(0,1200)");
        //  Thread.sleep(2000);
        //  h.setThe_india();
    }

}

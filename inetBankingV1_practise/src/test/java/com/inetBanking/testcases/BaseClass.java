package com.inetBanking.testcases;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
   public String baseURL="https://demo.guru99.com/V4/";
   public String username="mngr383688";
   public String password="EzUhUqA";
   public static WebDriver driver;
   
   @BeforeClass
   public void setup()
   {
	   System.setProperty("webdriver.chrome.driver",   System.getProperty("user.dir")+" //Drivers//chromedriver.exe");
	   driver = new ChromeDriver();
	 
   }
   
   @AfterClass
   public void tearDown()
   {
	   driver.quit();
   }
   
   
   
	

}

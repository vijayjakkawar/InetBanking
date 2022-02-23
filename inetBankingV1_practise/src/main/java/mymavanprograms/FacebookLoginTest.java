package mymavanprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginTest {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();    // To SetUp webdriver in maven Project
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("9502589165");
		driver.findElement(By.name("pass")).sendKeys("vij@y143");
		driver.findElement(By.name("login")).click();
		
		
       String exp_title="Facebook – log in or sign up"; 
	   String act_title=driver.getTitle();
		
		if( exp_title.equals( act_title)==true)
{
		System.out.println("Test is Pass ");
}
		else
		{
			System.out.println("Test is fail ");
		}
		driver.close();
	}

}




package mymavanprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webcommand {
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	int titlelength=driver.getTitle().length();
	System.out.println("the title of the web page:"+title);
	System.out.println("the titlelength of the web page:"+titlelength);
	driver.close();
}
}


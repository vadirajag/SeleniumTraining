package ArisSeleniumTrng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3Dynamicdrop 
{
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open the website.
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.id("nav-flyout-ya-signin")).click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
	driver.close();
	}

	
}

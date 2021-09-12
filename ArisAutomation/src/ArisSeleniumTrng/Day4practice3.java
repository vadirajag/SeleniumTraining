package ArisSeleniumTrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Day4practice3 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Alert handling//
		
        driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
        Thread.sleep(3000);
       
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("ABCD");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.quit();
 
	
	}

	
}

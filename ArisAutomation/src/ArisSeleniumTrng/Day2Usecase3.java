package ArisSeleniumTrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Usecase3 
{
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open the website.
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Select Round trip
		driver.findElement(By.xpath("//p[text()='Round trip']")).click();
		Thread.sleep(4000);
		System.out.println("Round trip radio button is selected : Pass");
		//Check Return on Date element gets displayed only after selecting the Round Trip
		/*String dateElement = driver.findElement(By.xpath("//h4[text()='Return on']")).getText();
		if(dateElement.equals("Return on"))
			System.out.println("Return on date field is displayed : Pass");
		else
			System.out.println("Failed");*/
		boolean dateElement = driver.findElement(By.xpath("//h4[text()='Return on']")).isDisplayed();
		System.out.println(dateElement);
		
		
		//fail scenario
		/*driver.findElement(By.xpath("//p[text()='Multi-city']")).click();
		Thread.sleep(4000);
		String dateElement2 = driver.findElement(By.xpath("//h4[text()='Return on']")).getText();
		if(dateElement2.equals("Return on"))
			System.out.println("Return on date field is displayed : Pass");
		else
			System.out.println("Failed");*/
	
	driver.close();
	}

	
}

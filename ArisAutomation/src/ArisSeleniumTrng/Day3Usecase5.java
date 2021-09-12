package ArisSeleniumTrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Usecase5 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		int sizeOf = driver.findElements(By.tagName("a")).size();
		System.out.println(sizeOf);
		
		//only text//
		for(int i=0;i<sizeOf;i++)
		{
			String linkText = driver.findElements(By.tagName("a")).get(i).getText();
			//String linkText1 = driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			if(!linkText.isEmpty() && linkText.matches("^[a-zA-Z]*$"))
			{
					System.out.println("Link Text : "+linkText);
			}
			
			//System.out.println("Link Text : "+linkText1);
		  // System.out.println("Link Text : "+linkText);
		 
		
		
	    }
	    
		driver.close();
		
		
	}

	
}

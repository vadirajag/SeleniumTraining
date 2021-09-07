package ArisSeleniumTrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Usecase1 
{
	public static void main(String[] args) throws Exception
	{
		String inputVal = "selenium";
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open the website.
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Enter the input value in search field.
		driver.findElement(By.name("q")).sendKeys(inputVal);
		Thread.sleep(1000);
		//CLick in search button.
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		//Check Result Page (Contain the Title selenium)
		String pTitle = driver.getTitle();
		System.out.println("The page Title is : "+pTitle);
		if(pTitle.contains(inputVal))
		{
			System.out.println("Navigation to resut page :  Pass");
		}
		else 
			System.out.println("Fail");
		//Check Input(SELENIUM) in the Home Page should be same as the OUTPUT Search Text (SELENIUM)
	    String pageinout = driver.findElement(By.xpath("//input[@value='selenium']")).getAttribute("value");
	    if(pageinout.equals(inputVal))
	    {
	    	System.out.println("Input " +inputVal +" in home page is matching with "+pageinout+ " output search text : Pass");
	    }
	    else {
	    	System.out.println("Failed");}
	    //System.out.println("search :"+pageinout);
		String timeTaken = driver.findElement(By.xpath("//div[@id='result-stats']/nobr")).getText();
		System.out.println("Time taken :"+timeTaken);
		driver.quit();
	}

	
}

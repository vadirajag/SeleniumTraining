package ArisSeleniumTrng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4practice1 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		//multiple window commands//
		Set<String> winid=driver.getWindowHandles();
        System.out.println(winid);
        Iterator<String> swin=winid.iterator();
        String parent=swin.next();
        String child=swin.next();
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.quit();
		
		
		
		
	}

	
}

package ArisSeleniumTrng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4practice2 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//String text = driver.findElement(By.xpath("//div[@id='draggable']")).getText();
	    //System.out.println(text);
//Frame's//

       // driver.navigate().to("");
        
        System.out.println(driver.findElements(By.tagName("iframe")).size());
                
        //myD.switchTo().frame(0);
        //myD.switchTo().frame("ID or NAME");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

 

        System.out.println(driver.findElement(By.id("draggable")).getText());
        
        WebElement vDrag=driver.findElement(By.id("draggable"));
        WebElement vDrop=driver.findElement(By.id("droppable"));
        
        Actions act=new Actions(driver);
        act.dragAndDrop(vDrag, vDrop).build().perform();
        
        Thread.sleep(5000);
        
        driver.switchTo().defaultContent();
        
        System.out.println(driver.findElement(By.className("entry-title")).getText());
        
        driver.quit();
 
	
	}

	
}

package ArisSeleniumTrng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.getTitle();
		System.out.println("Title of page is : " +driver.getTitle());
		driver.close();
	}
}

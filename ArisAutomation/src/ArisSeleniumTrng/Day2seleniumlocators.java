package ArisSeleniumTrng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2seleniumlocators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("food")).sendKeys("100");
		Thread.sleep(1000);
		driver.findElement(By.id("clothing")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.id("shelter")).sendKeys("300");
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyOther")).sendKeys("200");
		Thread.sleep(1000);
		System.out.println("Total monthly expense : "+driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value"));
		System.out.println("Total monthly Income : "+driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value"));
		driver.quit();
	}
}

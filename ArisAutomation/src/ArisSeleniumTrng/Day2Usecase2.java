package ArisSeleniumTrng;

import java.math.BigDecimal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Usecase2 
{
	public static void main(String[] args) throws Exception
	{
		int Food = 100, Clothing =200,shelter =300;
		int MonthlyPay =1000, MonthlyOther =2000;
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("food")).sendKeys(String.valueOf(Food));
		Thread.sleep(1000);
		driver.findElement(By.id("clothing")).sendKeys(String.valueOf(Clothing));
		Thread.sleep(1000);
		driver.findElement(By.id("shelter")).sendKeys(String.valueOf(shelter));
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyPay")).sendKeys(String.valueOf(MonthlyPay));
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyOther")).sendKeys(String.valueOf(MonthlyOther));
		Thread.sleep(1000);
		// Add the Variables Food, Clothing, Shelter and Store it in a variable vMExp
		float vMExp = Food + Clothing + shelter;
		//Add the variables Monthly Pay and Monthly Others and store it in a variable vMInc
		float vMInc = MonthlyPay + MonthlyOther;
		//Capture Monthly Income and Monthly Expense from application
		String appMInc = driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
	    String appMExp = driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	    System.out.println("TotalMonthlyIncome application "+appMInc);
	    System.out.println("TotalMonthlyExpenses application "+appMExp);
	    System.out.println("Calculated TotalMonthlyIncome "+(String.format("%.2f", new BigDecimal(vMInc))));
	    System.out.println("Calculated TotalMonthlyExpenses "+(String.format("%.2f", new BigDecimal(vMExp))));
	    //String exp = Float.toString(vMExp);
	   // String inc = Float.toString(vMInc);
	    Float inc = Float.parseFloat(appMInc);
	    Float exp = Float.parseFloat(appMExp);
	    // Monthly Income from the application should be same as added value for income
	    if(vMInc==inc) {
	    	
	       System.out.println("Monthly income is matching the income value in application : Pass");
	    }
	    else {
	    	System.out.println("Fail");	
	    }
	    //Monthly Expense from the application should be same as added value for Expense
	    if(vMExp==exp) {
	       System.out.println("Monthly expenses is matching the expenses value in application : Pass");
	    }
	    else {
	    	System.out.println("Fail");	
	    }
		driver.quit();
		
	}

	
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jobs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		//create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		//open Indeed home page
		driver.get("http://www.indeed.com");
		//Find what field and enter Selenium
		Thread.sleep(2000);
		driver.findElement(By.id("What")).sendKeys("Selenium");
		//Find location field and enter USA
		driver.findElement(By.id("where")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("where")).sendKeys("Orange");
		//Find Findjobs button and click on it
		Thread.sleep(2000);
		driver.findElement(By.id("fj")).click();
		//From job search result page,get page title and jobs count message
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("searchCount")).getText());
	driver.close();
	}

}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {
     /**
      * @param args
      */
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\kavyasri\\Downloads\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    driver.get("http://google.com");
	}

}

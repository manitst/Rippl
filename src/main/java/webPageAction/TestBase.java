package webPageAction;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

public static WebDriver driver;
	
	public static WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(5));

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                driver = new ChromeDriver();
            	driver.get("https://www.shopify.com/");
                driver.manage().window().maximize();
                 } 
            catch (Exception e) 
            {
                System.out.println("Error initializing driver: " + e.getMessage());
            }
        }
        return driver;
    }
	
	
}

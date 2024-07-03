package webPageAction;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
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
	
    public static  String RandomNameGen()
  	{
    	 String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
 	     String numbers = "0123456789";
 	     String allChars = alphabet + numbers;
 	     Random random = new Random();
 	     StringBuilder name = new StringBuilder();
         int length = 10;
         name.append(alphabet.charAt(random.nextInt(alphabet.length())));
 	    name.append(numbers.charAt(random.nextInt(numbers.length())));
 	   for (int i = 3; i < length; i++) {
 	      name.append(allChars.charAt(random.nextInt(allChars.length())));
 	    }

 	    return name.toString();
  	}
    public static WebDriver ripplrewardDashboard() {
        if (driver == null) {
            try {
                
                driver.switchTo().newWindow(WindowType.WINDOW);
            	driver.get("https://staging-may-2-test-store-1.myshopify.com/account");
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

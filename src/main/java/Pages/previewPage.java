package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webPageAction.TestBase;

public class previewPage extends TestBase
{
By widgetbtn = By.xpath("//*[@id=\"ripplFectButton\"]");
By challengename = By.xpath("//*[@id=\"main\"]/div[3]/div[4]/div[2]/div/div[2]/h2");

public void clickwidgetButton()
{
	driver.findElement(widgetbtn).click();
}
public String returnChallengeName()
{
	WebElement copytext = driver.findElement(challengename);
	String name = copytext.getText();
	return name;
}

}

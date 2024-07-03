package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import webPageAction.TestBase;

public class RipplRewardsPage extends TestBase
{
By ripplrewardstext = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[4]/div[2]/div/div[29]/div/div[2]/p[1]");
By innermenu = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[1]/div/button");
By brandinglink = By.xpath("/html/body/div[2]/div[3]/div[3]/div/ul/li[5]/a/div[2]/p");
By brandingframe = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[3]/div");
By previewlink = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[3]/div/div[2]/div/div[1]/button[1]");
By previewpage = By.xpath("//*[@id=\"Banner-template--22486486155550__6a3bb789-ce10-45f5-ae67-e2063ef8c76b\"]");


public WebElement returnChallengeName()
{
	WebElement name = driver.findElement(ripplrewardstext);
	return name;
	
}
public void directingToBrandingPage()
{
	driver.findElement(innermenu).click();
	driver.findElement(brandinglink).click();
	
}
public void clickPreview()
{
	WebElement brandframe = driver.findElement(brandingframe);
	driver.switchTo().frame(brandframe);
	driver.findElement(previewlink).click();
}
public void switchingToPreviewPage()
{
	WebElement page = driver.findElement(previewpage);
	driver.switchTo().frame(page);
}


}

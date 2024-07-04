package Pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webPageAction.TestBase;

public class previewPage extends TestBase {
	By widgetbtn = By.xpath("//*[@id=\"ripplFectButton\"]");
	By challengename = By.xpath("//*[@id=\"main\"]/div[3]/div[4]/div[2]/div/div[2]/h2");
	By loginwidget = By.xpath("/html/body/section");
	By widgetsignin = By.xpath("//*[@id=\"main\"]/div/div[4]/div[2]/button[2]");
	By custemail = By.xpath("//*[@id=\"CustomerEmail\"]");
	By custpassword = By.xpath("//*[@id=\"CustomerPassword\"]");
	By signinbtn = By.xpath("//*[@id=\"customer_login\"]/button");
	By widgetpop = By.xpath("/html[1]/body[1]/section[1]/header[1]");
	By basetag = By.xpath("//*[@id=\"main\"]/div[1]/div[4]/div[1]/div/div[2]/p[1]");
	By challengenamelist = By.xpath("//*[@id=\"main\"]/div[3]/div[4]/div/div");
	By tiername = By.xpath("//*[@id=\"main\"]/div[1]/div[4]/div[2]/p/span[2]");
	By shortdescription = By.xpath("//*[@id=\"main\"]/div[3]/div[4]/div/div/div[2]/div[1]");
	By nametemplate = By.xpath("//*[@id=\"main\"]/div[3]/div[4]/div/div/div[2]/h2");
	By textactiondes = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div/p/strong");
	By completeactionbtn = By.xpath("//*[@id=\"main\"]/div/div/button[2]");
	By trackingtext = By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/p");

	public void clickwidgetButton() {
		driver.findElement(widgetbtn).click();
	}

	public String returnChallengeName() {
		WebElement copytext = driver.findElement(challengename);
		String name = copytext.getText();
		return name;
	}

	public void ripplRewardPageLogin() {
		driver.findElement(widgetbtn).click();
		WebElement loginwidgetpopup = driver.findElement(loginwidget);
		driver.switchTo().frame(loginwidgetpopup);
		driver.findElement(widgetsignin).click();
		driver.findElement(custemail).sendKeys("manikandan.k@teknotrait.com");
		driver.findElement(custpassword).sendKeys("Tester@123");
		driver.findElement(signinbtn).click();
	}

	public void verifytagNameOfWidget(String filter_by_tags) {
		WebElement widgetpopup = driver.findElement(widgetpop);
		driver.switchTo().frame(widgetpopup);
		String txtbasetag = driver.findElement(basetag).getText();

		Assert.assertEquals(filter_by_tags, txtbasetag);

	}

	public void getChallengeName(String name) {
		String cname = driver.findElement(challengename).getText();
		Assert.assertEquals(name, cname);

	}

	public void verifyChallengeNameinTheList(String name) {
		String challengename = driver.findElement(challengenamelist).getText();
		Assert.assertEquals(name, challengename);

	}

	public void verifyTierNameFromWidget() {
		String gettiername = driver.findElement(tiername).getText();
		String actualtext = "Base tier";
		String expectedtext = gettiername.toLowerCase();
		actualtext.toLowerCase();
		Assert.assertEquals(expectedtext, actualtext);
	}

	public void verifyshortdescription(String short_description) {
		String shortdes = driver.findElement(shortdescription).getText();
		String expectedtext = short_description;
		Assert.assertEquals(expectedtext, shortdes);
	}

	public static String readTextFromFile(String filePath) throws IOException {
		StringBuilder documentText = new StringBuilder();
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\manikandan\\automation projects\\shopifyproject\\ShopifyMavenProject\\actiondis.txt"))) {
			while ((line = reader.readLine()) != null) {
				documentText.append(line).append("\n");
			}
		}
		return documentText.toString().trim();
	}

	public void verifyActionDescription() throws IOException {

		driver.findElement(nametemplate).click();
		String destext = driver.findElement(textactiondes).getText();
		String actiondesdoc = "C:\\manikandan\\automation projects\\shopifyproject\\ShopifyMavenProject\\actiondis.txt";
		String documenttext = readTextFromFile(
				"C:\\manikandan\\automation projects\\shopifyproject\\ShopifyMavenProject\\actiondis.txt");
		if (documenttext.equalsIgnoreCase(destext)) {
			System.out.println("Text content matches between document and webpage!");
		} else {
			System.out.println("Text content differs between document and webpage!");
		}
	}

	public void verifyTrackInfo(String tracking_instruction) {
		WebElement widgetpopup = driver.findElement(widgetpop);
		driver.switchTo().frame(widgetpopup);
		driver.findElement(challengename).click();
		driver.findElement(completeactionbtn).click();
		String trackininfocopy = driver.findElement(trackingtext).getText();
		Assert.assertEquals(widgetpopup, trackininfocopy);

	}
}

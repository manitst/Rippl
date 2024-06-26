package Pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import webPageAction.TestBase;

public class loginPage extends TestBase

{
	
	
	By loginlink = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/ul[1]/li[1]/a");
	By emailaddress = By.id("account_email");
	By continuewithemailbtn = By.xpath("//*[@id=\"account_lookup\"]/div[5]/button");
	By passwordfield = By.id("account_password");
	By loginbtn = By.xpath("//button[@name='commit']");
    //By storelist = By.xpath("//div[@class='Polaris-InlineStack']");
	//By storelist = By.xpath("//*[@id=\"AppFrameTopBar\"]/div/div[1]/div/div/div[3]/div[2]/div/div/div/button/div/div/span/p");
	//By storelist = By.xpath("//*[@class,'Details_1g1mh_4']");
	//By storelist = By.xpath("//*[name()='text' and contains(@class,'Polaris-Box')]");
	//By storelist = By.xpath("//*[@id=\"AppFrameTopBar\"]/div/div[1]/div/div/div[3]/div[2]/div/div/div/button/div/div/div/span/span/svg");
	By storelist = By.xpath("//span[@class='Polaris-Avatar__Initials']");
	By maystore = By.xpath("//div[normalize-space()='Staging May 2 Test Store 1']");
    //By ripplrewardstaging = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodyMd Polaris-Text--semibold']");
    //By ripplrewardstaging = By.xpath("//span[@class='Polaris-Text--root Polaris-Text--bodyMd Polaris-Text--semibold']"); 
    By ripplrewardstaging = By.xpath("//span[text()='Rippl Rewards Staging']");
	//By innermenu = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[1]/div/button/svg");
	//By innermenu = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[1]/div/button/span");
    //By frameswitch = By.xpath("//*[contains(@name,'app-iframe']");
    By frameswitch = By.xpath("//*[@name='app-iframe']");
    
    //By innermenu = By.xpath("//*[name()='path' and contains(@fill,'none')]");
    //By innermenu = By.xpath("/html/body/div[1]/div[1]/div[2]/main/div[1]/div/button");
    //By innermenu = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[1]/div/button/svg/path");
 
	By innermenu = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[1]/div/button");
	By programmenu = By.xpath("/html/body/div[2]/div[3]/div[3]/div/ul/li[2]/div/div[2]/p");
	By pointsmenu = By.xpath("/html/body/div[2]/div[3]/div[3]/div/ul/li[2]/ul/div/div/li[1]/a/div[2]/p");
	//By addwaystoearnbtn = By.xpath("//button[text()='Add Ways to Earn']");
	By addwaystoearnbtn = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/div[4]/div[1]/div[2]/button");
	By buildfromscratchbtn = By.xpath("/html/body/div[3]/div[3]/div/div/div[1]/div[2]/div[1]/div/div/h2");
	//By buildfromscratchbtn = By.className("MuiBox-root css-i83suy");
	By namefield = By.xpath("//*[@id=\":r3:\"]");
	
	By shortdiscription = By.xpath("//*[@id=\":r5:\"]");
	By actiondiscription = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[2]/div[1]/div/div/div[4]/div/div[2]/div[1]");
	By actionrepeatable = By.xpath("//*[contains(@name,':r4:')]");
	By startdates = By.xpath("//*[contains(@text,'20th']");
	By enddates = By.xpath("//contains[@text,'25th']");
	By filterbycustomertags = By.className("css-19bb58m");
	By imagetrackingtype = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[2]/div[3]/div/div[3]/div/div");
	By rewardpoints = By.id(":r13:");
	By watersaved = By.id(":r19:");
	By plasticsaved = By.id(":r1a:");
	By tressplanted = By.id(":r15:");
	By optionalemail = By.id(":r1m:");
	By contenttext = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[2]/div[5]/div/div/div[3]/div/div[2]/div[1]");
	By correlatedtask = By.id(":r1n:");
	By status = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[3]/div[1]/div[2]/div/label[1]/span[1]/input");
	By Tags = By.className("css-8mmkcg");
	By uploadbanner = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[3]/div[3]/div[2]/div/input");
	By icon = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[3]/div[4]/div[2]/div/label[1]/span[2]");
	By publishbtn = By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/main/form/div/div[4]/div/div/button[2]");
	
	public WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofNanos(2000));
			
	public void login()
	{
		driver.findElement(loginlink).click();
	}
	
	public void enterEmailAddress()  throws InterruptedException
	{
		driver.findElement(emailaddress).sendKeys("abhik.khandelwal01@gmail.com");
		
	 
	}
   public void clickContinuebtn() throws InterruptedException
   {
	   Thread.sleep(3000);
	   driver.findElement(continuewithemailbtn).click();
   }
   public void enterpassword(String password) throws InterruptedException
   {
	   
	   Thread.sleep(3000);
	   //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(passwordfield));
	   //element.sendKeys(password);
	   driver.findElement(passwordfield).sendKeys(password);
	 
   }
   public void clickLoginbtn() throws InterruptedException
   {
	   Thread.sleep(5000);
	   //wait.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();
	   driver.findElement(loginbtn).click();
	   
   }
   public void selectStore() throws InterruptedException
   {
	   Thread.sleep(9000);
	   WebElement dropdown = driver.findElement(storelist);
	   dropdown.click();
	   driver.findElement(maystore).click();
	   //wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();;
	   //Select store = new Select(driver.findElement(By.xpath("//*[name()='text' and contains(@class,'Polaris-Av')]")));
	   
	   //store.selectByVisibleText("Staging May 2 Test Store 1");
   }
   public void clickRipplRewardsStaginglink()
   {
	   driver.findElement(ripplrewardstaging).click();
   }
   public void clickinnermenu() throws InterruptedException
   {
	   Thread.sleep(8000);
	   WebElement iframeElement = driver.findElement(frameswitch);
	   driver.switchTo().frame(iframeElement);
	  //Thread.sleep(9000);
	  driver.findElement(innermenu).click();
	   
   }
   public void navigateToPoint() throws InterruptedException
   {
	   driver.findElement(programmenu).click();
	   Thread.sleep(2000);
	   driver.findElement(pointsmenu).click();
   }
   public void clickAddWaysToEarn() throws InterruptedException
   {
	   Thread.sleep(3000);
	   driver.findElement(addwaystoearnbtn).click();
   }
   public void clickbuildfromscratchbtn()
   {
	   driver.findElement(buildfromscratchbtn).click();
   }
   public void enternamefield(String name) throws InterruptedException
   {
	   Thread.sleep(3000);
	   driver.findElement(namefield).sendKeys(name);
   }
   public void entershortdiscription(String short_discription)
   {
	   driver.findElement(shortdiscription).sendKeys(short_discription);
   }
   public void enteractiondiscription()
   {
	   String filePath = "C:\\manikandan\\automation projects\\shopifyproject\\ShopifyMavenProject\\actiondis.txt"; // Replace with your actual path
	   String data = "";

	   try {
	     FileReader reader = new FileReader(filePath);
	     BufferedReader br = new BufferedReader(reader);

	     String line;
	     while ((line = br.readLine()) != null) {
	       data += line + "\n"; // Add newline character if needed
	     }

	     br.close();
	     reader.close();
	   } 
	   catch (IOException e) {
	     e.printStackTrace();
	   }
	   WebElement textBox = driver.findElement(actiondiscription);
	   textBox.sendKeys(data);
	   //driver.findElement(actiondiscription).sendKeys("C:\\manikandan\\automation projects\\shopifyproject\\ShopifyMavenProjectactoindis.txt");
   }
   public void select_action_repeatable()
   {
	   WebElement radiobtn = driver.findElement(actionrepeatable);
	   radiobtn.click();
   }
   public void enterstartdate(String startdate)
   {
	   driver.findElement(startdates).sendKeys(startdate);
	   
   }
   public void enterenddate(String enddate)
   {
	   driver.findElement(enddates).sendKeys(enddate);
   }
   public void selectfilter(String filter_by_customer_tags)
   {
	   driver.findElement(filterbycustomertags).sendKeys(filter_by_customer_tags);
	   
   }
   public void selectTrackingType()
   {
	   WebElement track = driver.findElement(imagetrackingtype);
	   track.click();
   }
   public void selectImageTrackingType()
   {
	   Select imagetracking = new Select(driver.findElement(imagetrackingtype));
	   imagetracking.selectByVisibleText("Live image capture");
   }
   public void rewardpointsandimpactdetails(String points,String water_saved, String plastic_saved,String Trees_planted)
   {
	driver.findElement(rewardpoints).sendKeys(points);
	driver.findElement(watersaved).sendKeys(water_saved);
	driver.findElement(plasticsaved).sendKeys(plastic_saved);
	driver.findElement(tressplanted).sendKeys(Trees_planted);
    
  }
   public void enterOptionalEmailSettings(String optional)
   {
	   driver.findElement(optionalemail).sendKeys(optional);
   }
   public void enterContent(String content,String correlated_task)
   {
	   driver.findElement(contenttext).sendKeys(content);
	   driver.findElement(correlatedtask).sendKeys(correlated_task);
   }
   public void selectTags()
   {
	   		Select tagsselect = new Select(driver.findElement(Tags));
	   	    tagsselect.selectByVisibleText("#Actions");
   }
   public void uploadImage()
   {
	   WebElement uploadimg = driver.findElement(uploadbanner);
	   uploadimg.click();
	   uploadimg.sendKeys("C:\\Users\\User\\Pictures\\Saved Pictures");
	   
   }
   public void selectIcon()
   {
	   WebElement iconselect = driver.findElement(icon);
	   iconselect.click();
   }
   public void publishpage()
   {
	   driver.findElement(publishbtn).click();
   }
}

package stepDefinitions;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPageAction.TestBase;
import org.junit.Assert;

public class Login_stepDefinition extends TestBase
{
	
	loginPage loginpage = new loginPage();
	TestBase testbase = new TestBase();

	@Given("I have launched the shopify page")
	public void i_have_launched_the_shopify_page() {
	    testbase.getDriver();
	    System.out.println("The shopify site has been launched");
	}
	@When("I click on login")
	public void i_click_on_login() 
	{
	  loginpage.login();
	}
	@When("I enter {string} and click continue with email button")
	public void i_enter_and_click_continue_with_email_button(String emailid) throws InterruptedException
	{
	    loginpage.enterEmailAddress(emailid);
	    loginpage.clickContinuebtn();
	}
	
	@When("I enter the {string} and click login button")
	public void i_enter_the_and_click_login_button(String password) throws InterruptedException
	{
	 loginpage.enterpassword(password);
	 loginpage.clickLoginbtn();
	 //String actualtitle = driver.getTitle();
	 String actualurl = driver.getCurrentUrl();
	 
	 String expectedurl = "https://admin.shopify.com/?country=IN";
	 Assert.assertEquals(expectedurl, actualurl);
	 System.out.println("The user successfully logged in");
	}
	@When("I select staging May  Test store")
	public void i_select_staging_may_test_store() throws InterruptedException
	{
	loginpage.selectStore();   
	}
	@When("I click on Rippl reward staging")
	public void i_click_on_rippl_reward_staging() {
	loginpage.clickRipplRewardsStaginglink();
	}
	@When("I navigate to the points from the sub menu inside Rippl app")
	public void i_navigate_to_the_points_from_the_sub_menu_inside_rippl_app() throws InterruptedException {
	   loginpage.clickinnermenu();
	   loginpage.navigateToPoint();
	}
	@When("I click on Add ways to Earn")
	public void i_click_on_add_ways_to_earn() throws InterruptedException {
	   loginpage.clickAddWaysToEarn();
	}
	@When("I Click on build from scratch button")
	public void i_click_on_build_from_scratch_button() {
	    loginpage.clickbuildfromscratchbtn();
	    //String actualurl = driver.getCurrentUrl();
		
	   // String expectedurl = "https://admin.shopify.com/store/staging-may-2-test-store-1/apps/rippl-rewards-staging-1/points";
		//Assert.assertEquals(expectedurl, actualurl);
		//System.out.println("The user is in build from scratch page");
	}
	@When("I enter {string} and {string}")
	public void i_enter_and(String name, String short_discription) throws InterruptedException
	{
	loginpage.enternamefield(name);
	loginpage.entershortdiscription(short_discription);
	}
	@When("I enter action description")
	public void i_enter_action_description() 
	{
	 loginpage.enteractiondiscription();  
	}
	@When("I select action repeatable as no")
	public void i_select_action_repeatable_as_no() 
	{
	  loginpage.select_action_repeatable();
	  
	}
	@When("I enter the {string} and {string}")
	public void i_enter_the_and(String startdate, String enddate) 
	{
	loginpage.enterstartdate(startdate);
	loginpage.enterenddate(enddate);
	}
	@When("I select <Filter_by_customer_tags> and {string}")
	public void i_select_filter_by_customer_tags_and(String filter_by_customer_tags) 
	{
	loginpage.selectfilter(filter_by_customer_tags);    
	}
	@When("I select <tractkingtype>")
	public void i_select_tractkingtype() 
	{
	loginpage.selectTrackingType();    
	}
	@When("I select <imagetrackingtype>")
	public void i_select_imagetrackingtype() 
	{
	loginpage.selectImageTrackingType();  
	}
	@When("I enter reward {string} and  impact details {string},{string},{string}")
	public void i_enter_reward_and_impact_details(String rewardpoints, String water_saved, String plastic_saved, String Trees_planted) 
	{
	loginpage.rewardpointsandimpactdetails(rewardpoints, water_saved, plastic_saved, Trees_planted);    
	}
	@When("I enter the {string} email settings")
	public void i_enter_the_email_settings(String optional) 
	{
	loginpage.enterOptionalEmailSettings(optional);
	}

	@When("I enter the details of {string},{string} and select the status")
	public void i_enter_the_details_of_and_select_the_status(String content, String correlated_task) 
	{
	  loginpage.enterContent(content,correlated_task);
	}
	@When("I select the Tags and upload a banner image")
	public void i_select_the_tags_and_upload_a_banner_image() 
	{
	loginpage.selectTags();
	loginpage.uploadImage();
	}
	@When("I select the option icon as default")
	public void i_select_the_option_icon_as_default() 
	{
	loginpage.selectIcon();   
	}
	@Then("I the ways to earn should get published")
	public void i_the_ways_to_earn_should_get_published() 
	{
		loginpage.publishpage();
	System.out.println("The ways to earn page should be get published");
	}



	
}

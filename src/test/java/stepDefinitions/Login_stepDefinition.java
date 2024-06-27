package stepDefinitions;

import Pages.RipplRewardsPage;
import Pages.loginPage;
import Pages.previewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPageAction.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Login_stepDefinition extends TestBase
{
	
	loginPage loginpage = new loginPage();
	TestBase testbase = new TestBase();
	RipplRewardsPage ripplrewardspage = new RipplRewardsPage();
	previewPage previewpage = new previewPage();

	@Given("user is on Shopify home page")
	public void user_is_on_shopify_home_page() throws InterruptedException
	{
		  testbase.getDriver();
		    System.out.println("The shopify site has been launched");
		    loginpage.login();
		    loginpage.enterEmailAddress();
		    }
	@When("user selects the store Staging May {int} Test Store {int}") 
	public void user_selects_the_store_staging_may_test_store(Integer int1, Integer int2) throws InterruptedException
	{
	  int1 = 2;
	  int2 = 1;
	  loginpage.selectStore();
	}
	@When("selects the {string} extension")
	public void selects_the_extension(String string) 
	{
		loginpage.clickRipplRewardsStaginglink();
	}
	@When("navigates to Add Ways to Earn - Build From Scratch")
	public void navigates_to_add_ways_to_earn_build_from_scratch() throws InterruptedException
	{
		 loginpage.clickinnermenu();
		 loginpage.navigateToPoint();
		 loginpage.clickAddWaysToEarn();
		 loginpage.clickbuildfromscratchbtn();
		 
	}
	@When("fills up the build from scratch form with appropriate data {string},<short_description>,{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void fills_up_the_build_from_scratch_form_with_appropriate_data_short_description(String name, String short_discription, String startdate, String enddate, String filter_by_customer_tags, String rewardpoints, String water_saved, String plastic_saved, String Trees_planted, String optional, String content, String correlated_task) throws InterruptedException
	{
		loginpage.enternamefield(name);
		loginpage.entershortdiscription(short_discription);
		loginpage.enteractiondiscription();
		loginpage.select_action_repeatable();
		loginpage.enterstartdate(startdate);
		loginpage.enterenddate(enddate);
		loginpage.selectfilter(filter_by_customer_tags);
		loginpage.selectTrackingType();
		loginpage.selectImageTrackingType();
		loginpage.rewardpointsandimpactdetails(rewardpoints, water_saved, plastic_saved, Trees_planted);
		loginpage.enterOptionalEmailSettings(optional);
		loginpage.enterContent(content,correlated_task);
		
		
		
	}
	@When("uploads banner image and publishes the challenge")
	public void uploads_banner_image_and_publishes_the_challenge() {
		loginpage.uploadImage();
		loginpage.publishpage();
		System.out.println("The ways to earn page should be get published");
	}
	
	
		@Then("verify created challenge is displayed in Ways to Earn challenges list")
	public void verify_created_challenge_is_displayed_in_ways_to_earn_challenges_list() 
		{
			
			String challengename = "Fitness Bingo challenge";
			Assert.assertEquals(challengename, ripplrewardspage.returnChallengeName());
			System.out.println("The challengename is same as entered in the form");
	}
	@Then("verify created challenge contains exactly the same details filled in the form during creation {string},<short_description>,{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void verify_created_challenge_contains_exactly_the_same_details_filled_in_the_form_during_creation_short_description(String name, String short_discription, String startdate, String enddate, String filter_by_customer_tags, String rewardpoints, String water_saved, String plastic_saved, String Trees_planted, String optional, String content, String correlated_task) 
	{
	  ripplrewardspage.directingToBrandingPage();
	  previewpage.clickwidgetButton();
	  String challengename = "Fitness Bingo Challenge";
	  Assert.assertEquals(challengename, previewpage.returnChallengeName());
	  
	}



	
}

package stepDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import Pages.RipplRewardsPage;
import Pages.loginPage;
import Pages.previewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPageAction.TestBase;

public class Login_stepDefinition extends TestBase {

	loginPage loginpage = new loginPage();
	TestBase testbase = new TestBase();
	RipplRewardsPage ripplrewardspage = new RipplRewardsPage();
	previewPage previewpage = new previewPage();

	@Given("user is on Shopify home page")
	public void user_is_on_shopify_home_page() throws InterruptedException {
		testbase.getDriver();
		System.out.println("The shopify site has been launched");
		loginpage.login();
		loginpage.enterEmailAddress();
	}

	@When("user selects the store Staging May {int} Test Store {int}")
	public void user_selects_the_store_staging_may_test_store(Integer int1, Integer int2) throws InterruptedException {
		int1 = 2;
		int2 = 1;
		loginpage.selectStore();
	}

	@When("selects the {string} extension")
	public void selects_the_extension(String string) {
		loginpage.clickRipplRewardsStaginglink();
	}

	@When("navigates to Add Ways to Earn - Build From Scratch")
	public void navigates_to_add_ways_to_earn_build_from_scratch() throws InterruptedException {
		loginpage.clickinnermenu();
		loginpage.navigateToPoint();
		loginpage.clickAddWaysToEarn();
		loginpage.clickbuildfromscratchbtn();

	}

	@When("fills up the build from scratch form with appropriate data {string},<short_description>,{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void fills_up_the_build_from_scratch_form_with_appropriate_data_short_description(String name,
			String short_discription, String startdate, String enddate, String filter_by_customer_tags,
			String rewardpoints, String water_saved, String plastic_saved, String Trees_planted, String optional,
			String content, String correlated_task) throws InterruptedException {
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
		loginpage.enterContent(content, correlated_task);

	}

	@When("uploads banner image and publishes the challenge")
	public void uploads_banner_image_and_publishes_the_challenge() {
		loginpage.uploadImage();
		loginpage.publishpage();
		System.out.println("The ways to earn page should be get published");
	}

	@Then("verify created challenge is displayed in Ways to Earn challenges list")
	public void verify_created_challenge_is_displayed_in_ways_to_earn_challenges_list() {

		String challengename = "Fitness Bingo challenge";
		Assert.assertEquals(challengename, ripplrewardspage.returnChallengeName());
		System.out.println("The challengename is same as entered in the form");
	}

	@Then("verify created challenge contains exactly the same details filled in the form during creation {string},<short_description>,{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void verify_created_challenge_contains_exactly_the_same_details_filled_in_the_form_during_creation_short_description(
			String name, String short_description, String startdate, String enddate, String filter_by_tags,
			String reward_points, String water_saved, String plastic_saved, String trees_planted,
			String optional_email_settings, String content, String correlated_task) {
		ripplrewardspage.directingToBrandingPage();
		previewpage.clickwidgetButton();
		String challengename = "Fitness Bingo Challenge";
		Assert.assertEquals(challengename, previewpage.returnChallengeName());
		Map<String, String> challengeData = new HashMap<>();
		challengeData.put("challengeName", name);
		challengeData.put("shortDescription", short_description);
		challengeData.put("startDate", startdate);
		challengeData.put("endDate", enddate);
		challengeData.put("filter_By_Tags", filter_by_tags);
		challengeData.put("rewardpoints", reward_points);
		challengeData.put("watersaved", water_saved);
		challengeData.put("plasticsaved", plastic_saved);
		challengeData.put("treesplanted", trees_planted);
		challengeData.put("optionalEmailSettings", optional_email_settings);
		challengeData.put("Content", content);
		challengeData.put("correlatedTask", correlated_task);
		loginpage.verifyChallengeData(challengeData);

	}

	@Then("verify the created {string} is visible on user dash widget under Actions for Base_Tier customers {string}")
	public void verify_the_created_is_visible_on_user_dash_widget_under_actions_for_base_tier_customers(String name,
			String filter_by_tags) {
		testbase.ripplrewardDashboard();
		previewpage.ripplRewardPageLogin();
		previewpage.verifytagNameOfWidget(filter_by_tags);
		previewpage.getChallengeName(name);

	}

	@Then("verify user can view the challenge {string} in widget dash only if the {string} is set as active")
	public void verify_user_can_view_the_challenge_in_widget_dash_only_if_the_is_set_as_active(String name,
			String statusActive) {
		previewpage.verifyChallengeNameinTheList(name);
		loginpage.statusactive();
	}

	@Then("verify user is assigned and able to view base tier <filterByTags> by default in widget dash")
	public void verify_user_is_assigned_and_able_to_view_base_tier_filter_by_tags_by_default_in_widget_dash() {
		previewpage.verifyTierNameFromWidget();
	}

	@Then("verify same <short_description> is visible on user dash widget under Actions just below the Challenge name")
	public void verify_same_short_description_is_visible_on_user_dash_widget_under_actions_just_below_the_challenge_name(
			String short_description) {
		previewpage.verifyshortdescription(short_description);

	}

	@Then("verify same action description is visible under details when user selects the challenge name")
	public void verify_same_action_description_is_visible_under_details_when_user_selects_the_challenge_name()
			throws IOException {
		previewpage.verifyActionDescription();

	}

	@Then("verify user can view same {string} in widget dash for the challenge {string} set during challenge creation")
	public void verify_user_can_view_same_in_widget_dash_for_the_challenge_set_during_challenge_creation(
			String tracking_instruction, String string2) {
		previewpage.verifyTrackInfo(tracking_instruction);
	}

}

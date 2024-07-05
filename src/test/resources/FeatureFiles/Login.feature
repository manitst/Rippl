#Author: Manikandan

 Feature: Ways to Earn 
  @buildfromscratch                                             
Scenario Outline: As an admin user, I should be able to build a template from scratch 
  Given user is on Shopify home page
  When user selects the store <store_name>   
  And selects the "Rippl Reward staging" extension
  And navigates to Add Ways to Earn - Build From Scratch  
  And fills up the build from scratch form with appropriate data <name>,<short_description>,<startdate>,<enddate>,<filter_by_tags>,<tracking_instruction>,<reward_points>,<water_saved>,<plastic_saved>,<trees_planted>,<optional_email_settings>,<content>,<correlated_task>
  And uploads banner image and publishes the challenge
  Then verify created challenge is displayed in Ways to Earn challenges list
  And verify created challenge contains exactly the same details filled in the form during creation <name>,<short_description>,<startdate>,<enddate>,<filter_by_tags>,<tracking_instruction>,<reward_points>,<water_saved>,<plastic_saved>,<trees_planted>,<optional_email_settings>,<content>,<correlated_task>
  And verify the created "name" is visible on user dash widget under Actions for Base_Tier customers <filter_by_tags>
  And verify user can view the challenge "name" in widget dash only if the "challenege status" is set as active
  And verify user is assigned and able to view base tier <filterByTags> by default in widget dash
  And verify same <short_description> is visible on user dash widget under Actions just below the Challenge name
  And verify same action description is visible under details when user selects the challenge name
  And verify user can view same <tracking_instruction> in widget dash for the challenge "challenge_name" set during challenge creation
  And verify user is able to complete the action challenge_name
  And verify users account is credited with the same <reward_points> on completing the challenge_name which was configured
  And verify on approving the completed action, a <correlated_task> configured in the challenge is created in the Tasks
  And verify imapct reward point <reward_points> should only be credited to the users account if the action is approved
  
  
  
  
  
Examples:
  |store_name                |name                     |short_discription                          |startdate   |enddate     |filter_by_tags          |tracking_instruction|reward_points|water_saved|plastic_saved|trees_planted|optional_email_settings       |content|correlated_task         |
  |Staging May 2 Test Store 1|"Fitness Bingo challenge"|"Engage in a variety of fitness activities"|"05-20-2024"|"05-25-2024"|"base_tier"             |"Live image capture"|"1"          |"1"        |"1"          |"1"          |"abhik.khandelwal01@gmail.com"|"test" |"Drink a glass of water"|



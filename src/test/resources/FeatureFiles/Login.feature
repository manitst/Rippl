#Author: Manikandan

  @Login
Feature: Login for an existing user

@TC1 
  Scenario: As an registered user I need to login
  
  Given I have launched the shopify page
  When I click on login
  And I enter <email> and click continue with email button
  And I enter the <password> and click login button
	And I select staging May  Test store
	And I click on Rippl reward staging
	And I navigate to the points from the sub menu inside Rippl app
	And I click on Add ways to Earn
	And I Click on build from scratch button 
	And I enter <name> and <short_discription>
	And I enter action description
	And I select action repeatable as no
	And I enter the <startdate> and <enddate>
	And I select <Filter_by_customer_tags> and <tracking_details>
	And I select <tractkingtype>
	And I select <imagetrackingtype>
  And I enter reward <points> and  impact details <water_saved>,<plastic_saved>,<Trees_planted>
	And I enter the <optional> email settings
	And I enter the details of <content>,<correlated_task> and select the status
	And I select the Tags and upload a banner image
	And I select the option icon as default
	Then I the ways to earn should get published
  
Examples:
|email                         |password   |name                     |short_discription                          |startdate   |enddate     |filter_by_customer_tags|tracking_details|trackingtype        |points|water_saved|plastic_saved|Trees_planted|optional                      |content|correlated_task         |Tags      |
|"abhik.khandelwal01@gmail.com"|"Rippl@321"|"Fitness Bingo challenge"|"Engage in a variety of fitness activities"|"20-05-2024"|"25-05-2024"|"base_tier"            |"Image"         |"Live image capture"|"1"   |"1"        |"1"          |"1"          |"abhik.khandelwal01@gmail.com"|"test" |"Drink a glass of water"|"#actions"|



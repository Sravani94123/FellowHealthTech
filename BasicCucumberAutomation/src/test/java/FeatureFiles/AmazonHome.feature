
Feature: Home page validations

Background: 
Given user is on home page

@SmokeTest
Scenario:1 validate the login user details in home page
	Then verify login user name on home page
	
Scenario:2 validate the display of logo and location 
Then verify display of amazon logo and locationon left corner of page

Scenario:3 validate the tabs available in home page
Then verify tabs Medical Care
Then verify Groceries
Then verify PrimeVideo
Then verify EverydayEssentials
Then verify Amazon Basic
Then verify Buy Again
Then verify Todays Deals
Then verify Prime Keep shopping for
Then verify Customer Service
Then verify Best Sellers
Then verify Music
Then verify New Releases 
		
Scenario:4 validation option on right corner in home page
Then verify display of Returns
Then Verify Order
Then Cart logo 

Scenario Outline:5 validate search box
	When click on search text box enter data in "<Search box text>" and click on search
	Then verify dropdown options
	When select desired option from search results dropdown
	Then user is on search results page
	Examples: 
	|Search box text|
	|Mobile         |
	|laptop         |


Scenario:6 Validate Accounts and Lists
	When user clicks on Account and Lists
	Then Manage profile page display
	When click on account url and select your addresses 
	Then Your Account and your addresses page display accordingly
	When click on Add address
	Then add a new address page display
	When enter all details and click on add address
	|sravani |
	|laa marques|
	|katy|
	|texas|
	|77494  |
	Then user is on address page
	
	
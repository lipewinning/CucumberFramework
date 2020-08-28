Feature: Login into account
	Existing user should be able to login to account using correct credentials

Scenario: Login into account with valid password 
	Given I access webdriveruniversity.com
	And I click on the login portal button
	And I enter a username
	And I enter a "valid" password
	When I click on the login button
	Then I should be presented with a successful validation alert
	
	
Scenario: Login into account with invalid password 
	Given I access webdriveruniversity.com
	And I click on the login portal button
	And I enter a username
	And I enter a "invalid" password
	When I click on the login button
	Then I should be presented with a successful validation alert
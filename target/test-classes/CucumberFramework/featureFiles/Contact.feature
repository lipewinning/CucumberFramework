Feature: Submit data to wedriveruniversity.com using contact us form


Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity
	When I click on the contact us button
	And I enter a valid first name
	And I enter a valid last name
	And I enter a valid email address
	And I enter commments
	| example comment one | example comment two |
	When I click on the submit button
	Then the information should successfully be submitterd via the contact us form
	
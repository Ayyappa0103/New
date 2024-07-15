Feature: Test login to swag application functionality

Scenario: Login to application with valid Crediantials.


	Given user is open the browser.
	And user is on login page.
	When user enters the <username> and <password>
	And user clicks on login button.
	Then user will navigates to home page.
  Examples:
  | username | password |
  | standard_user | secret_sauce |
  | problem_user | secret_sauce |
  
  
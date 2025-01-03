Scenario: Register User
  @smoke @regression
Given I open the browser with url
When I click on sign up button
Then I enter all the details
And I able to see the register user
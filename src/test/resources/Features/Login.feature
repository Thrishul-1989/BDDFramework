Feature: Login

   @smoke @regression
  Scenario: Validate the Login

    And I click on the signin
    Then I should able to see the homepage

@smoke
  Scenario: Validate the Login1

    And I click on the signin
    Then I should able to see the homepage
@smoke
  Scenario: Validate the Login-invalid

    And I click on the signin
    Then I should able to see the homepage




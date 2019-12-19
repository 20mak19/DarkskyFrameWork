
@darkSky
Feature: Darksky feature
  Background:
    Given I am on Darksky Home Page
  @darkSky
  Scenario: Verify invalid Login error message
    When I am on the darksky Register page
    And I click on login button
    And I enter email into EmailAddress box
    And I enter password into Password box
    Then I verify error message "password and username does not match"
  @darkSky-2
  Scenario: Verify individual day temp timeline
    Given I am on DarkSky Home Page
    When I expand todays timeline
    Then I verify lowest and highest temp is displayed correctly
  @darkSky-3
  Scenario: Verify timeline is displayed in correct format
    Given I am on Darksky Home Page
    When I enter city into search text field on home screen
    And I verify city's time zone
    Then I verify timeline is displayed with two hours incremented
@homepage
Feature: As a Babcock website user
  First page i should see is the homepage
  Where I SHOULD be
  1) prompted with cookie message
  2) see standard header and footers
  3) see a sales pitch message on the top banner
  3) see the sections; Latest Projects, Latest News
  ​
  #And the links within those sections are correct accordingly  ​
  Background: arrive to the Babcock homepage
    Given I am on the homepage after a cache refreshed browser opened

  Scenario: Checking cookie message appears and can be closed
    Then the cookie statement should appear
    And I can click to open the statement page
    And Also be able to close the cookie statement​
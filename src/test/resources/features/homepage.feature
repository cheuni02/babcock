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

  @cookies
  Scenario: Checking cookie message appears and can be closed
    Then the cookie statement should appear
    And the title of the cookie statement should be shown
    And I can click to open the statement page
    And Also be able to close the cookie statement​

  Scenario: Checking the menu bar appears and the relevant links and sublinks appear
    Then the Menu bar shows
    And the links/sublinks are as follows:
      | Capabilities                  | Sectors                      | Locations     | Careers                     | Investors                  | Suppliers | More       |
      | Infrastructure                | Defence                      |  Africa       | Apprenticeships             | Results and Presentations  | -         | About      |
      | Equipment                     | Energy                       | South America | Careers Login               | Annual Reports             | -         | News       |
      | Training                      | Nuclear                      | Australasia   | A Day In The Life Of...     | Key Factsheet              | -         | Contact Us |
      |                               | Emergency Services           | Canada        | Experienced Hires           | Governance                 | -         |            |
      |                               | Marine                       | UK/Europe     | Further Careers Information | Financial Calendar         | -         |            |
      |                               | Airports                     | Middle East   | Graduates                   | Key Financial Figures      | -         |            |
      |                               | Automotive                   |               | Register for Job Alerts     | Regulatory News            | -         |            |
      |                               | Media and Communications     |               | Working for Babcock         | Share Price Information    | -         |            |
      |                               | Information and Intelligence |               | Vacancies                   | Shareholder Information    | -         |            |
      |                               | Mining and Construction      |               |                             | IR Contact                 | -         |            |
      |                               | Rail                         |               |                             | Consensus                  | -         |            |


Feature: Free CRM Login Feature
#  Without Examples Keyword
#  Scenario: Free CRM Login Page Test Scenario
#    Given User is already on Login Page
#    When User clicks on Login button on main page
#    Then User enters username and password
#    Then User clicks on login button
#    Then User is landing Home Page
#
#    Given User is already on Home Page
#    When User clicks on Calendar button
#    Then User lands on Calendar Page
#    When User clicks on New button
#    Then User lands on Create New Event Page
#    Then User inserts the information and click Save button
#    Then User lands on recently created event page

#  With Examples Keyword
  Scenario Outline: Free CRM Login Page Test Scenario
    Given User is already on Login Page
    When User clicks on Login button on main page
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is landing Home Page

    Given User is already on Home Page
    When User clicks on Calendar button
    Then User lands on Calendar Page
    When User clicks on New button
    Then User lands on Create New Event Page
    Then User inserts the information and click Save button
    Then User lands on recently created event page
    Examples:
    |       username       |  password  |
    | yusuf@kucukvatan.com | Boshnack01 |
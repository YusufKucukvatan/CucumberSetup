$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/yusufkucukvatan/Desktop/CucumberSetup/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#  Without Examples Keyword"
    },
    {
      "line": 3,
      "value": "#  Scenario: Free CRM Login Page Test Scenario"
    },
    {
      "line": 4,
      "value": "#    Given User is already on Login Page"
    },
    {
      "line": 5,
      "value": "#    When User clicks on Login button on main page"
    },
    {
      "line": 6,
      "value": "#    Then User enters username and password"
    },
    {
      "line": 7,
      "value": "#    Then User clicks on login button"
    },
    {
      "line": 8,
      "value": "#    Then User is landing Home Page"
    },
    {
      "line": 9,
      "value": "#"
    },
    {
      "line": 10,
      "value": "#    Given User is already on Home Page"
    },
    {
      "line": 11,
      "value": "#    When User clicks on Calendar button"
    },
    {
      "line": 12,
      "value": "#    Then User lands on Calendar Page"
    },
    {
      "line": 13,
      "value": "#    When User clicks on New button"
    },
    {
      "line": 14,
      "value": "#    Then User lands on Create New Event Page"
    },
    {
      "line": 15,
      "value": "#    Then User inserts the information and click Save button"
    },
    {
      "line": 16,
      "value": "#    Then User lands on recently created event page"
    },
    {
      "line": 18,
      "value": "#  With Examples Keyword"
    }
  ],
  "line": 19,
  "name": "Free CRM Login Page Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-page-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User clicks on Login button on main page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User is landing Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User clicks on Calendar button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User lands on Calendar Page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User clicks on New button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User lands on Create New Event Page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User inserts the information and click Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User lands on recently created event page",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-page-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 34,
      "id": "free-crm-login-feature;free-crm-login-page-test-scenario;;1"
    },
    {
      "cells": [
        "yusuf@kucukvatan.com",
        "Boshnack01"
      ],
      "line": 35,
      "id": "free-crm-login-feature;free-crm-login-page-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Free CRM Login Page Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-page-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User clicks on Login button on main page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User enters \"yusuf@kucukvatan.com\" and \"Boshnack01\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User is landing Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User is already on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User clicks on Calendar button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "User lands on Calendar Page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User clicks on New button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User lands on Create New Event Page",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User inserts the information and click Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User lands on recently created event page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 2794759221,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_Login_button_main_page()"
});
formatter.result({
  "duration": 1841016712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yusuf@kucukvatan.com",
      "offset": 13
    },
    {
      "val": "Boshnack01",
      "offset": 40
    }
  ],
  "location": "LoginPageSteps.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 194350004,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 50219929,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_is_landing_Home_Page()"
});
formatter.result({
  "duration": 2007485115,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_is_already_on_home_page()"
});
formatter.result({
  "duration": 9395465,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_new_calendar_button()"
});
formatter.result({
  "duration": 174358590,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_lands_on_calendar_page()"
});
formatter.result({
  "duration": 22581811,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_clicks_on_new_button()"
});
formatter.result({
  "duration": 79573834,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_lands_on_create_new_event_page()"
});
formatter.result({
  "duration": 22974080,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_inserts_the_information_and_click_save_button()"
});
formatter.result({
  "duration": 827032124,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_lands_on_recently_created_event_page()"
});
formatter.result({
  "duration": 102159946,
  "status": "passed"
});
});
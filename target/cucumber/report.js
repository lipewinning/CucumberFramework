$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Contact.feature");
formatter.feature({
  "line": 1,
  "name": "Submit data to wedriveruniversity.com using contact us form",
  "description": "",
  "id": "submit-data-to-wedriveruniversity.com-using-contact-us-form",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4933223814,
  "status": "passed"
});
formatter.before({
  "duration": 1255435387,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Submit valid data via contact us form",
  "description": "",
  "id": "submit-data-to-wedriveruniversity.com-using-contact-us-form;submit-valid-data-via-contact-us-form",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I access webdriveruniversity",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the contact us button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter a valid first name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter a valid last name",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter a valid email address",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter commments",
  "rows": [
    {
      "cells": [
        "example comment one",
        "example comment two"
      ],
      "line": 11
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the information should successfully be submitterd via the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactSteps.i_access_webdriveruniversity()"
});
formatter.result({
  "duration": 2489704103,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.i_click_on_the_contact_us_button()"
});
formatter.result({
  "duration": 1176800104,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.i_enter_a_valid_first_name()"
});
formatter.result({
  "duration": 830053754,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.i_enter_a_valid_last_name()"
});
formatter.result({
  "duration": 624321388,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.i_enter_a_valid_email_address()"
});
formatter.result({
  "duration": 702638021,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.i_enter_commments(DataTable)"
});
formatter.result({
  "duration": 793755398,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.i_click_on_the_submit_button()"
});
formatter.result({
  "duration": 1938155322,
  "status": "passed"
});
formatter.match({
  "location": "ContactSteps.the_information_should_successfully_be_submitterd_via_the_contact_us_form()"
});
formatter.result({
  "duration": 1121076994,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "Existing user should be able to login to account using correct credentials",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1190318062,
  "status": "passed"
});
formatter.before({
  "duration": 1102430253,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login into account with valid password",
  "description": "",
  "id": "login-into-account;login-into-account-with-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I access webdriveruniversity.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the login portal button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter a username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter a \"valid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should be presented with a successful validation alert",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_access_webdriveruniversity_com()"
});
formatter.result({
  "duration": 4393715,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_login_portal_button()"
});
formatter.result({
  "duration": 1475987,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_a_username()"
});
formatter.result({
  "duration": 264516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 11
    }
  ],
  "location": "LoginSteps.i_enter_a_password(String)"
});
formatter.result({
  "duration": 1637100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 308582,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_be_presented_with_a_successful_validation_alert()"
});
formatter.result({
  "duration": 72501407,
  "status": "passed"
});
formatter.before({
  "duration": 995281050,
  "status": "passed"
});
formatter.before({
  "duration": 1146110638,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login into account with invalid password",
  "description": "",
  "id": "login-into-account;login-into-account-with-invalid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I access webdriveruniversity.com",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on the login portal button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter a username",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter a \"invalid\" password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I should be presented with a successful validation alert",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_access_webdriveruniversity_com()"
});
formatter.result({
  "duration": 158457,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_login_portal_button()"
});
formatter.result({
  "duration": 83906,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_a_username()"
});
formatter.result({
  "duration": 67756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 11
    }
  ],
  "location": "LoginSteps.i_enter_a_password(String)"
});
formatter.result({
  "duration": 100040,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_the_login_button()"
});
formatter.result({
  "duration": 65441,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_be_presented_with_a_successful_validation_alert()"
});
formatter.result({
  "duration": 74672537,
  "status": "passed"
});
});
Feature: Login to OLR Application
@olrlogin
  Scenario: Login to OLR and Validate CGI
    Given Login page of OLR
    When  Enter credentials as below
    | Field | Value |
    | userName| ish.kumar@contractor.cengage.com |
    | password| Q2VuZ2FnZTE=  |
    And Click on log-in button
    Then User is logged in successfully
    Then Navigate to Course frame
    Then Enter the Course key
    Then Grep the CGI
    Then Write the CGI in Excel
   # Then Logout from the screen.


Feature: Login and Create Variant on Cengage Brain

  @brainlogin
  Scenario: User should be able to log-in and Create variant
    Given I am on Cengage Brain log-in screen
    When Enter valid credential
      | Fields   | value                            |
      #   | emailId  | Ishtestinstructor@test.cengage.com |
      #   | password | Password1                          |
      | emailId  | ish.kumar@contractor.cengage.com |
      | password | Q2VuZ2FnZTE=                     |
    # | emailId  | vinay.thakur@contractor.cengage.com |
    #  | password | Techizen_123 |
    And Click on login button
    Then User is logged in successfully "Instructor SSO - Instructor Resource Center"
    Then Select the product from drop down
    Then Click on Create Course link
    Then Select the Radio button for create new course
    Then Enter all required details
      | Fields     | value                   |
      | courseName | ish_Test                |
      | beginDate  | dateFormat.format(date) |
      | endDate    | 10/30/2016              |
    Then Click on Create Course
    Then User is logged in successfully "Instructor SSO - Create Course Confirmation"
    Then Course key is generated and captured
    Then Logout from Cengage Brain

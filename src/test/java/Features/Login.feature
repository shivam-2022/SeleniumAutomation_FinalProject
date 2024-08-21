Feature: Login feature for e-commerce website


  @Login-Logout
  Scenario: Validate user is able to login to website
    Given User navigate to login page
    When user enters credential and click enter
    Then user should be logged in



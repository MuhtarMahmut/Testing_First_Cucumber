Feature: Testing the Log in functionality
  Scenario: When user enter valid username and password, should be able to loged in.
    Given Browser is ready and website is uploaded
    When enters valid username and password
    Then user should be loged in.

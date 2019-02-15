Feature: Smoke Test And Report
  Scenario: LogIn and gain the report
    Given Browser is set and website is open
    When someone Entered "Muhtar.Mahmut0519@yahoo.com" and "Mayire007"
    Then User can log in and then website closes.
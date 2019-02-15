Feature: Test Gmail Smoke Scenario
  Scenario: Test LogIn functionality
    Given Open Chrome and got to the Gmail sign in Website
    When I Enter Valid "Muhtar.Mahmut0519@gmail.com" and valid "Muhtar05190707"
    Then User Should be able to login successfully
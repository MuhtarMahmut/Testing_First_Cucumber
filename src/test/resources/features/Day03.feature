Feature: Smoke Tests for yahoo
  Scenario Outline: When I enter valid username and password, I should be able to loged in.
    Given Browser and Website should be ready
    When I Entered the  "<username>" and the "<password>"
    Then I should be loged in.

    Examples:
      |  username | password |
      |Muhtar.Mahmut0519@gmail.com| password1|
      |Muhtar.Mahmut0519@yahoo.com| Muhtar05190707 |
      |mmmmmmmmm                   | 112312312     |
      |jjjjj                       | 1223111       |


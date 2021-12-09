Feature: For Serenity Report Stats Debug

  Scenario Outline: scenario1
    When I run this test with "<data>"
    Then I should succeed
    @dev
    Examples:
      | data |
      | dev1 |
    @qa
    Examples:
      | data |
      | qa1  |

  Scenario Outline: scenario2
    When I run this test with "<data>"
    Then I should succeed
    @dev
    Examples:
      | data |
      | dev2 |
    @qa
    Examples:
      | data |
      | qa2  |

Feature: Google Search Multiple items
  @Regression
  Scenario Outline: Find some "<item>"
    Given I am on Google search page to do multiple search
    When I do multiple search for "<item>"
    Then the page tile should start with "<title>"

    Examples:
      | item | title |
      | Cheese! | cheese |
      | Test! | test |


Feature: Google Search Single item
  @Smoke
  Scenario: Find some watch
    Given I am on Google search page to do single search
    When I search for watch
    Then the page tile should start with watch
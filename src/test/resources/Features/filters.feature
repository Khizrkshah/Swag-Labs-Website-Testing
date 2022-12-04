Feature: Filter options testing.

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the Login button is clicked

  Scenario: Filter from A to Z
    Given the inventory page is opened
    And the Product Sort button is clicked
    When the Filter From A to Z button is clicked
    Then the Page Items is sorted from A to Z

  Scenario: Filter from Z to A
    Given the inventory page is opened
    And the Product Sort button is clicked
    When the Filter From Z to A button is clicked
    Then the Page Items is sorted from Z to A

  Scenario: Filter from price Low to High
    Given the inventory page is opened
    And the Product Sort button is clicked
    When the Filter from price Low to High is clicked
    Then the Page Items is sorted from Price Low to High

  Scenario: Filter from price High to Low
    Given the inventory page is opened
    And the Product Sort button is clicked
    When the Filter from price High to Low is clicked
    Then the Page Items is sorted from Price High to Low
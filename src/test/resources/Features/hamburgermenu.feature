Feature: Hamburger Menu Test

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the Login button is clicked

    Scenario: All items test
      Given the Cart is opened
      And the Hamburger Menu is Clicked
      When the All items option is chosen
      Then the inventory page is opened
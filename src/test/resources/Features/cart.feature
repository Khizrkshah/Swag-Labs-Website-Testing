Feature: Cart Testing.

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the Login button is clicked

  Scenario Outline: Checking the total value
    Given the '<item>' is added to the cart
    And the Cart is opened
    And the checkout button is clicked
    And the First Name is filled with 'Khizr'
    And the Last Name is filled with 'Shah'
    And the Zip Code is filled with '4032'
    When the Continue button is clicked
    Then '<total>' should be shown
    Examples:
      | item | total |
      | Sauce Labs Backpack | Total: $32.39 |
      | Sauce Labs Bike Light | Total: $10.79 |
      | Sauce Labs Backpack,Sauce Labs Bike Light | Total: $43.18 |
      | Sauce Labs Bolt T-Shirt,Sauce Labs Fleece Jacket,Sauce Labs Onesie | Total: $79.89 |
      | Sauce Labs Bolt T-Shirt,Sauce Labs Fleece Jacket,Sauce Labs Onesie,Test.allTheThings() T-Shirt (Red) | Total: $97.16 |

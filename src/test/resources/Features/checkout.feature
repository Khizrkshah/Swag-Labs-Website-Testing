Feature: Checkout Validity test.

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the Login button is clicked
    And the Cart is opened

    Scenario: Correct Information Input
      Given the checkout button is clicked
      And the First Name is filled with 'Khizr'
      And the Last Name is filled with 'Shah'
      And the Zip Code is filled with '4032'
      When the Continue button is clicked
      Then the Checkout step two page is opened

    Scenario Outline: Incorrect Information Input
      Given the checkout button is clicked
      And the First Name is filled with '<firstName>'
      And the Last Name is filled with '<lastName>'
      And the Zip Code is filled with '<postCode>'
      When the Continue button is clicked
      Then '<message>' is shown

      Examples:
        | firstName | lastName | postCode | message
        |  |  |  | Error: First Name is required
        |  | Shah | 4032 | Error: First Name is required
        | Khizr |  | 4032 | Error: Last Name is required
        | Khizr | Shah |  | Error: Postal Code is required


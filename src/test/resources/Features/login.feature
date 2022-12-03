Feature:Testing the login feature.

  Background:
  Given the homepage is open

  Scenario: Correct Login
    Given the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    When the Login button is clicked
    Then the Product page is opened

  Scenario Outline: Invalid Login
    Given the Username is filled with '<username>'
    And the Password is filled with '<password>'
    When the Login button is clicked
    Then a '<msg>' is shown
    Examples:
      | username | password | msg |
      | standard_user| | Epic sadface: Password is required |
      | | secret_sauce| Epic sadface: Username is required  |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.|
      | | | Epic sadface: Username is required  |
      | | | Epic sadface: Username is required  |



  Scenario Outline: Incorrect Login
    Given the Username is filled with '<username>'
    And the Password is filled with '<password>'
    When the Login button is clicked
    Then an incorrect_login_message is shown

    Examples:
      | username | password |
      | standard_user | isthispasswordcorrect? |
      | iamacorrectusername | imightbeanincorrectpassword |
      | problem_user | thistotallyisthecorrectpassword |
      | iwonderificanuserhtisasauser | justletmein! |

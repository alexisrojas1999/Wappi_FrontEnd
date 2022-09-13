Feature:Login
  AS a QAA
  I want to test Log in to the website
  To test the functionality

  Scenario: Correct login
    Given  that the user has a registered username and password
    When the user enter corresponding information
      | user        | password   |
      | alexis1999  | fish1234   |
    Then the user should see the offer page


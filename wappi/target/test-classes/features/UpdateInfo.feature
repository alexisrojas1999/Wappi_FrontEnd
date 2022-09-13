Feature:UpdateInfo
  AS a QAA
  I want to Update the information of my username
  To test the functionality


  Background: Correct login
    Given  that the user has a registered username and password
    When the user enter corresponding information
      | user        | password   |
      | alexis1999  | fish1234   |
    Then the user should see the offer page


  Scenario: information

    When  the button is pressed it will ask for to enter a first name
      | firstname | lastname|birthday|
      | alexis  | rojas     |25/09/1999|








Feature: order
As quality control automation
I want purchase an item
To validate the order

Background: Correct login
Given  that the user has a registered username and password
When the user enter corresponding information
| user        | password   |
| alexis1999  | fish1234   |
Then the user should see the offer page


Scenario: the user wants to request an order

When The user clicks on the order
Then the order appears.


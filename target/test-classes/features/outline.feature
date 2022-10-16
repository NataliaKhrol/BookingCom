Feature: Search on booking.com
  This is DESCRIPTION!!!!
  Scenario Outline: Name and hotel rating should be correct after search (Dubai)
    Given user is on the search page
    When user searches for <city>
    Then hotel name is <hotel>
    And hotel rating is <rating>
Examples:
    |city|hotel|rating|
    |"Dubai"|"Flora Al Barsha Hotel At The Mall"|"8.2"|
    |"Minsk"|"Another hotel name"|"9.0"|
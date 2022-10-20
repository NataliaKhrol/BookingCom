Feature: Search on booking.com
  This is DESCRIPTION!!!!
  Scenario Outline: Name and hotel rating should be correct after search (Dubai)
    Given user is on the search page
    When user searches for <city>
    Then hotel name is <hotel>
    And hotel rating is <rating>
Examples:
    |city|hotel|rating|
    |"Dubai"|"MD Hotel By Gewan formerly Cassells"|"7.6"|
    |"Dubai"|"IntercityHotel Dubai Jaddaf Waterfront"|"7.9"|
    |"Minsk"|"Another hotel name"|"9.0"|
Feature: Search on booking.com
  This is DESCRIPTION!!!!
  Scenario: Name and hotel rating should be correct after search (Dubai)
    Given user is on the search page
    When user searches for "Dubai"
    Then hotel name is "MD Hotel By Gewan formerly Cassells"
    And hotel rating is "7,6"

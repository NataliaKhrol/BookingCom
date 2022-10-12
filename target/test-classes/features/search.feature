Feature: Search on booking.com
  This is DESCRIPTION!!!!
  Scenario: Name and hotel rating should be correct after search (Dubai)
    Given user is on the search page
    When user searches for "Dubai"
    Then hotel name is "IntercityHotel Dubai Jaddaf Waterfront"
    And hotel rating is "8.0"

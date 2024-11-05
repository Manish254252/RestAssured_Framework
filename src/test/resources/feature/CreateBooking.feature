Feature: Validate Create Booking End Point

  Scenario: Verify user can create booking
    Given user wants to call "/booking" end point
    And set header "Content-Type" to "application/json"
    And set request body from file "create_booking.json"
    When user performs post call
    Then verify status code is 200
    And verify response body has same data as request
    And verify response body has a field "booking.firstname" is "Chirag"
    And verify response schema with "create_booking_schema.json"

  Scenario: Verify user can get list of booking
    Given user wants to call "/booking" end point
    When user performs get call
    Then verify status code is 200


  Scenario Outline: Verify user get error for invalid amount
    Given user wants to call "/booking" end point
    And set header "Content-Type" to "application/json"
    And set request body from file "create_booking.json" with "totalprice" value "<Amount>"
    When user performs post call
    Then verify status code is 500

    Examples:
      | Amount    |
      | -100      |
      | 0         |
      | 100000000 |

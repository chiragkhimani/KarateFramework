Feature: Get List Of Booking

  Scenario: Verify user can retrieve list of bookings
    Given url host
    When method get
    Then status 200
    And print response





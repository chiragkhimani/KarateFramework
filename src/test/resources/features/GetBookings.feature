Feature: Get List Of Booking

  Scenario: Verify user can retrieve list of bookings
    Given url 'https://restful-booker.herokuapp.com/booking'
    When method get
    Then status 200
    And print response



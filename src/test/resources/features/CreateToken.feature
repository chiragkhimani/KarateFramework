Feature: Create Token

  Background:
    * def body = read("classpath://json//create_token.json")

  Scenario: Verify user can create token
    Given url host
    And path '/auth'
    And header Content-Type = "application/json"
    And header Accept = "application/json"
    And request body
    When method post
    Then status 200
    And print response

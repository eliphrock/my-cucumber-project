@MedunnaRoom
Feature: Medunna Room Creation

  Background: Signin Medunna
    Given user is on "https://medunna.com" page
    When click on user icon
    And click on Sign In option
    And enter "john_doe" in username input
    And enter "John.123" in password input
    And click on Remember Me checkbox
    And click on Sign In submit button

  Scenario Outline: Create Room
    When click on Items&Titles
    And click on Room options
    And click on Create a new room button
    And enter "<room number>" in Room Number input
    And select Suitoption from Room Type dropdown
    And click on status checkbox
    And enter "<price> in Price input
    And enter "<Description>" in Description input
    And click on Save button
    And click on Created Date
    Then assert that room is created via "<room number>"

    Then close the application
    Examples:
      | room number | price | description |
      | 78907654 | 345 | Room 1 |
      | 78907433 | 567 | My Resting Room |
      | 75690761 | 543 | Good viewed |
      | 34600985 | 222 | Need extra service |
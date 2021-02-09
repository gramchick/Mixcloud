Feature: Logged in user should be able to search for necessary music artist, open artist's page,
  add an artist to favourites, make sure that artist's page is added and then delete this artist from favourites.


  Background: Login into account with correct credentials
    Given User goes to Mixcloud website
    When User find and click on the login button on page
    And User enters valid username
    And User enters valid password
    When User clicks on the 'log in' button
    Then User should be logged in succesfully


  Scenario: Find and open artist's page, add and delete artist's page from favourites
    Given User clicks on Search field
    When User enters artist name in the Search field
    And User opens an artist's page
    Then User adds an artist's track to favourites
    When User goes to User profile
    And User finds added track
    Then User deletes an artist's page from Favourites

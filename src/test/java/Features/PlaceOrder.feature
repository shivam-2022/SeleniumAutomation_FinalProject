Feature: End to end order place

  Background: User is logged in
    Given User navigate to login page
    When user enters credential and click enter
    Then user should be logged in
    @Test @TC3
    Scenario: Validate user is able to place and order by selecting size and colour of product
      When user search for "tees" in the search box
      Then user selects an item from the list of items
      When user select size and colour and click add to cart button
      Then user click cart icon and proceed to checkout
      When user click next and place order button
      Then order should be placed successfully

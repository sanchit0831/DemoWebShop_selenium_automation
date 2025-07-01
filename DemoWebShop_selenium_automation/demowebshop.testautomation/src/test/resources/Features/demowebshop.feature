Feature: DemoWebShop functionality testing

  Scenario Outline: Account registration
    Given user click register button and navigates to registration page
    When user enters <gender>, <email>, <password>, <name> and <lname>
    And user clicks register button
    Then user is navigated to account created successfully page
    And user can log out successfully

    Examples: 
      | gender | email                     | password            | name    | lname |
      | male   | vikrantverma786@gmail.com | vikrantverma@12345@ | Vikrant | Verma |

  Scenario Outline: Account login successfully
    Given user click login button and navigates to login page
    When user enters the <email> and <password>
    And user clicks login button
    Then user is navigated to homepage

    Examples: 
      | email                     | password            |
      | vikrantverma786@gmail.com | vikrantverma@12345@ |

  Scenario: Add gift card to cart
    Given user clicks on gift cart button and navigates to gift card page
    And user enters gift card details
    When user clicks on add to cart button
    Then gift card is added to cart

  Scenario: Place order
    Given user clicks cart button
    And user accepts terms and condition and clicks checkout
    When user enters billing company, country, city, address, zip code, phno
    And user clicks on continue button
    Then order is placed

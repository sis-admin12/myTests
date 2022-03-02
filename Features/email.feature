Feature: Sent a question to the Website
Scenario Outline: Try to send a question with an invalid email

  	Given Open the browser "Chrome"
    When  Enter the URL "https://urchinsys.com/"
    And   Find ‘Get your questions answered! ’ and click
    And   Enter name and questions
    And   Enter 3 invalid email "<email>"
    And   Click send button
    Then  User see an message error
    
    Examples:
    | email |
    | sadsad@ |
    | kgjhhg@khjg |
    | sfds@as.c. |
    
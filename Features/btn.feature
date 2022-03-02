Feature: Verify Service and Instagram btn
Scenario: Work with Service and Instagram btn

  	Given Open a Web browser "Mozila"
    When  Open this url "https://urchinsys.com/"
    And   Click ‘Services’ button from the top
    And   Verify that the correct URL (https://urchinsys.com/#services) loads
    And   Verify that there is ‘Software Development’ information
    And   Click the instagram button from the footer
    Then  Verify that the correct URL (https://www.instagram.com/urchinsys/) loads and verify if the Urchinsys profile is opened
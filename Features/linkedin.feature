Feature: Verify Linkedin btn
Scenario: Press Linkedin btn then is open the main page in linkedin

  	Given Start the Web browser "Chrome"
    When  Open url "https://urchinsys.com/"
    And   Click ‘Linedin’ button from the top
    And   Scroll down and press ‘Support Specialist’ button from the “Recently posted jobs” section
    And   Verify that there is information about connection
    And   Remember number of connections
    Then  Click and verify that the same number of connections are shown
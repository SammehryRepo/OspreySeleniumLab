Feature: Major Functionalities for Smoke Test
  @Smoke
  Scenario: Validate Home page title
    Then Validate top left corner is "TEKSCHOOL"
    Then Click on SignIn link
    Then I Enter Email "ospreyLabSession@gmail.com"
    Then I Enter Password "Osprey@1234"
    Then I Click on Login button
    Then Verify the text message is displayed as "wrong username or password"

Feature: Major Functionalities for Smoke Test
@SmokeTest
  Scenario: Validate Home page title
    Then Validate top left corner is "TEKSCHOOL"


    Scenario: Validate Home page title and sign in button
      Then Validate top left corner is "TEKSCHOOL"
      Then Validate Sign In Button is Enabled
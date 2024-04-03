@Regression
Feature: Create New Account Page

  @CreateNewAccount

  Scenario: Create new Account with valid credential

    Given User click on Sign In Button
    Given User click on Create Account
    When User fill Form "name" and "email" and "password"
    When User Click on Sign up button
    Then User will navigate to Account Profile Page
    Then Validate "name" and "email" in account page
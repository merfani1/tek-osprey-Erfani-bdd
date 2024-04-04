Feature: Retail App security test feature

 # Background: Description about the background
  #  Given user click on sign In Button

@SecurityTest

Scenario Outline: Validate Valid user credential
  Given User click on Sign In Button
  When User enter "<username>" and "<password>" and click on login
  Then User will see Account button on home page

  Examples:
  |  username                  |password   |
  |mohammad_osprey@tekschool.us|12345678Ab@|
  |mansoor@gmail.com           |Ruya@2014  |


  Scenario Outline: Validate invalid username and valid password
    Given User click on Sign In Button
    When User enter "<username>" and "<password>" and click on login
    Then validate error message "<errorMessage>"
  Examples:
  |username          |password      |errorMessage                 |
  |Wrong@gmail.com   | 12345678Ab@  |  wrong username or password |
  |mansoor@gmail.com |WrongPassword |wrong username or password|


 # Scenario: Validate invalid username and valid password
  #  Given User click on Sign In Button
   # When User enter "Wrong@gmail.com" and "12345678Ab@" and click on login
    # Then validate error message "wrong username or password"





# Scenario: Validate different valid user credential
 #  Given User click on Sign In Button
  # When User enter "mansoor@gmail.com" and "Ruya@2014" and click on login
   #Then User will see Account button on home page

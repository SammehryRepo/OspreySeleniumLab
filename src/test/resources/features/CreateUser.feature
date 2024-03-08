Feature: Create User in Tek School Application
@CreateNewUser @Smoke @Regression
  Scenario: Creating an new user with valid inputs
    When Click on sign in link
    Then Click on Create New Account button
    Then Enter valid detail in the required feilds
      | name     | OspryClass                |
      | email    | ospreyBDDLab@tekschool.us |
      | password | yBDDLab@654               |
  Then click on signUp button
    Then Validate the Name in Profile as "OspryClass"
    Then Validate the Email in Profile as "ospreyBDDLab@tekschool.us"
    Then Click on Logout Button





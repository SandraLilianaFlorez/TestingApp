# Autor: Sandra Florez

@stories
Feature: uTest
  As a user, I want to be able to create a new user
  @scenario1
    Scenario: Create new user
      Given than Sandra wants to register
        | strFirstName | strLastName | strEmail                 | strBirthMonth | strBirthDay | strBirthYear | strCity  | strZipCode | strPassword   | strConfirmPassword |
        | Sandra       | Florez      | sflorezrios@hotmail.com  | August        | 16          | 1994         | Envigado | 05001      | Happiness2022 | Happiness2022      |

      When Sandra has created and user, she wants to login
      | strEmail              | strPassword
      | sflorezrios@gmail.com | Happiness2022
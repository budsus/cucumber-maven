@BasicCalculator
Feature: Basic Arithmetic
  Uji pertama untuk arimatika dasar

  Background: A Calculator
    Given a calculator I just turned on

  Scenario: First Addition
    When I add 4 and 5
    Then the result is 9

  Scenario: Another Addition
    When I add 4 and 7
    Then the result is 11

  Scenario Outline: Add two numbers <num1> & <num2>
    When I add <num1> and <num2>
    Then the result is <total>

    Examples:
      | num1 | num2 | total |
      | -2 | 3 | 1 |
      | 10 | 15 | 25 |
      | 99 | -99 | 0 |
      | -1 | -10 | -11 |
Feature: Calculation



Scenario Outline: : Add two numbers
  Given User input two numbers <num1> <num2>
When user input sign '+'
Then calculate numbers
And assert calculation <output>
  Examples:
    | num1 | num2 | output |
    | 10   | 12   |  22.0    |
    | 10   | 10   |  20.0    |


  Scenario: Multiply two numbers
    Given User input two numbers 10 12
When user input sign '*'
Then calculate numbers
And assert calculation 120

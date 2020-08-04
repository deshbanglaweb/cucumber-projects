Feature: Calculation

Background:
Given User input two numbers 10 12

Scenario: Add two numbers
When user input sign '+'
Then calculate numbers
And assert calculation

Scenario: Multiply two numbers
When user input sign '*'
Then calculate numbers
And assert calculation

Feature: Log in Facebook

@SeleniumTest
Scenario: Log in Facebook
Given Open home page
When User input "email" and "password"
Then User cannot login
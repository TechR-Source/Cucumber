Feature: Application Login

Scenario: Home Page - Default login

Given Use is on netbanking login page
When User login into the applicaion with the username and password
Then Homepage is populated
And Card are displayed 
Feature: Facebook functionality testing
Scenario: Facebook login credentials testing
Given User should be in facebook login page
When User should enter username and password
And User should click login button
Then User should verify the sucess message
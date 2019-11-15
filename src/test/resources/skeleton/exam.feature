@productscenario
Feature: Scebario for testmeapp
 
Background: login with user credentials
Given user is on home page
When user enter username and password and click on login button
Then user  should be logged in and verified

@AddtoCartAndPaymentProcess
Scenario: Succesfull checkout
Given navigate to headphone
And add to shopping cart
When proceed to checkout
And select bank add credentials
Then redirected to thankyou 



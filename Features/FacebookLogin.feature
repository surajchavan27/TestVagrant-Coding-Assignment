Feature: FacebookLoginModule

@Sanity
Scenario: Login facebook  with valid data

Given user is able to launch Browser
And user is able enter url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
When user is able to enter email "admin@yourstore.com" & password "admin"
And user is able to click on login button
Then user is on Homepage
And user is able to click on logout
And user is on login page

@Regrassion
Scenario Outline: Login with facebook mulitiple data

Given user is able to launch Browser
And user is able enter url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
When user is able to enter email "<email>" & password "<password>"
And user is able to click on login button
Then user is on Homepage
And user is able to click on logout
And user is on login page

Examples:
|email| |password|
|admin@suraj.com| |admin123|
|admin@yourstore.com| |admin|



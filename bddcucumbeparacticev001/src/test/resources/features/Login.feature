Feature: Login to the Facebook login page
Scenario Outline: Login to Facebook with credentials
Given I open the facebook login page
When I enter "username" and "password"
Then I Clicked the login button

Example:
|username|password|
|98404804702|tec11230|


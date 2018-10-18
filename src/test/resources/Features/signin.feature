@Signin
Feature: As a end User I should able to Signin to the Application

@ValidSignin
Scenario: Trying to Login to the Application
Given I am on Mystore Home Page
When I Enter Valid Credentials
Then I should able to see the MyAddress page 
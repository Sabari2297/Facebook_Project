Feature: Facebook Login page

Scenario: Facebook Login Functionally
Given User Launch the url
When User enter the facebook username
And User enter the facebook password
And User click the login button
Then User see the next page

Scenario: Facebook Login Functionally

When User enter the facebook username  "Sabari123@gmail.com"
And User enter the facebook password "1234567890"
And User click the login button
Then User see the next page

Scenario: Facebook Login Functionally

When User enter the facebook username  "Karthi123@gmail.com"
And User enter the facebook password "0987654321"
And User click the login button
Then User see the next page

Scenario Outline: Facebook Login Functionally
		When User enter the facebook username  "<Username>"
		And User enter the facebook password "<Password>"
		And User click the login button
		Then User see the next page
		
Examples:

		|Username|Password|
		|Arun123@gmail.com|126646|
		|Ajay456@gmail.com|546214|
		|Kannan11232@gmail.com|94612|


Feature: W3Schoos Online Tutorials

Scenario: Java Class Tutorials 
Given user launches browser and open w3School website
When user on "w3school" home page
Then user verifies page title should be "W3Schools Online Web Tutorials"
When user on w3school homepage clicks on "Tutorials" link
And user on selects "learn java" from tutorials
When user on "Java" home page
Then user verifies page title should be "Java Tutorial"
Then user on java tutorial home page lists all java class options
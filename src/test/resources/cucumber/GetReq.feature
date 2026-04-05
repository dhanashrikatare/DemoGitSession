
Feature:this feature file contains the test cases for get request

Scenario: to verify the valid 'Activities>GET' method for valid response

Given Base Url 
When i send the GET request for activities 
Then i should get the valid response code 200
And i should get the valid response body for activities
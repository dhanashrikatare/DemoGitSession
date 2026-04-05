Feature:this is the feature file for post request
Scenario: this is the scenario for post request

Given Base Url is given for activities
When i send the POST request for activities
Then i should get the valid response status code 200
And i should get the valid response body for post activities
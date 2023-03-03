Feature: Login

  Rule: Customers need to provide valid credentials to access the product catalog

      Scenario: Colin log in with valid credentials
        Given Colin has logged on the application
        Then he should be presented with the product catalog
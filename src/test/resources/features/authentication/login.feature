Feature: Login

  Rule: Customers need to provide valid credentials to access the product catalog

      Scenario: Colin log in with valid credentials
        Given Colin has logged on the application
        Then he should be presented with the product catalog

        Scenario: Colin log in with invalid credentials
          Given Colin is on the login page
          When Colin logs in with invalid credentials
          Then he should be see the error message
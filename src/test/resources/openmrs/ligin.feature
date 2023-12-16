Feature:

  Scenario: validate the successful login process for open mrs
    Given user is open mrs user provide their credentails
    Then user validates title as 'Home' and 'https://demo.openmrs.org/openmrs/referenceapplication/home.page'

  Scenario Outline: negative scenario for open mrs login functionality
    Given user open mrs login page and provides invalid credential username as '<username>' and '<password>'
    Then user validates an error message as 'Invalid username/password. Please try again.'
    Examples: test data for open mrs negative test cases
      | username  | password     |
      | test      | psdpa        |
      |           | sdasdasda    |
      | sdvsdvsdv |              |
      | 123122    | 3e23r23r     |
      | wdfwdfw   | 324234234    |
      | admin     | er23r233r23d |
      | asfadf    | Admin123     |
      | ADMN     | Admin123     |
      | Adin     | ADMIN123     |
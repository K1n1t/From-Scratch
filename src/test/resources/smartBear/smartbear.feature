Feature:

  Scenario: validation of smart bear web site
    When user on login page and user validates title
    |title1|Web Orders Login|

    Then user enters username and password
    |username|Tester|
    |password|test  |

    And user clicks login button
    Then user validates the title of the next page
    |title2|Web Orders|

    And user validates header of the page
    |header|List of All Orders|




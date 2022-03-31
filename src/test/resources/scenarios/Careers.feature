Feature: Careers

  Background:
    Given I am on home page

  Scenario Outline: Go to Careers and check links to external pages
    When  I go to CAREERS via footer
    And   I click <button> button
    Then  Page is loaded

    Examples:
    |button                 |
    |SEARCH_OUR_JOB_OPENINGS|
    |OPEN_JOB_POSITIONS     |


  Scenario Outline: Go to Careers and check employee data
    When  I go to CAREERS via footer
    Then  Employee data are correct: <employee>

    Examples:
      |employee        |
      |Gry Collignon   |
      |Daria Czajkowska|
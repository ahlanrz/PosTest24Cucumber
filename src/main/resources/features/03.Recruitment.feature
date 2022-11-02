Feature: Recruitment

  Scenario: Recruitment user function
    When User click menu Recruitment
    Then User On Menu Recruitment

  Scenario: Recruitment Searching by Hiring Manager Name
    When User select hiring manager name
    And User click button search
    Then Data name Linda display by system
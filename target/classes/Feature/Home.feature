Feature: Home feature
  
  @Test1
  Scenario : Add a valid candidate
    Given Open Application url "<URL>"
    When Enter User Name,Password and Click on Login
    Then Click on recruitment 
    Then Click on Add
    Then Enter First Name,Last Name,Email,Contact No,Click on Checkbox
    When Click on Save button
    Then verify Add a valid candidate successfully
    
    @Test2
    
    Scenario: Download a candidate's resume
    Given Open Application url "<URL>"
    When Enter User Name, Password and Click on Login
    Then Click on recruitment 
    Then Click on Candidate Name Field
    Then Enter Candidate Name in the Field
    When Click on Search button
    Then Click on Candidate
    And Click on Edit
    Then Click on Choose File
    When Choose the File
    Then Click on Save
    And verify Download a candidate's resume
    
    
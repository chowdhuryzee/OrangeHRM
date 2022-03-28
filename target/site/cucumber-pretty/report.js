$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Home feature",
  "description": "",
  "id": "home-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Add a valid candidate",
  "description": "",
  "id": "home-feature;add-a-valid-candidate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Application url \"\u003cURL\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter User Name,Password and Click on Login1",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on recruitment",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Add button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter \"First Name\",\"Last Name\",\"Email\",\"Contact No\",\"Click on Checkbox\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Save button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify Add a valid candidate successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cURL\u003e",
      "offset": 22
    }
  ],
  "location": "Loginpagestepdeff.open_Application_url(String)"
});
formatter.result({
  "duration": 501257300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 43
    }
  ],
  "location": "Loginpagestepdeff.enter_User_Name_Password_and_Click_on_Login(int)"
});
formatter.result({
  "duration": 2048488000,
  "status": "passed"
});
formatter.match({
  "location": "Loginpagestepdeff.click_on_recruitment()"
});
formatter.result({
  "duration": 957004800,
  "status": "passed"
});
formatter.match({
  "location": "Loginpagestepdeff.click_on_Add_button()"
});
formatter.result({
  "duration": 537970300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "First Name",
      "offset": 7
    },
    {
      "val": "Last Name",
      "offset": 20
    },
    {
      "val": "Email",
      "offset": 32
    },
    {
      "val": "Contact No",
      "offset": 40
    },
    {
      "val": "Click on Checkbox",
      "offset": 53
    }
  ],
  "location": "Loginpagestepdeff.enter(String,String,String,String,String)"
});
formatter.result({
  "duration": 106232200,
  "status": "passed"
});
formatter.match({
  "location": "Loginpagestepdeff.click_on_Save_button()"
});
formatter.result({
  "duration": 102007800,
  "status": "passed"
});
formatter.match({
  "location": "Loginpagestepdeff.verify_Add_a_valid_candidate_successfully()"
});
formatter.result({
  "duration": 118451700,
  "status": "passed"
});
});
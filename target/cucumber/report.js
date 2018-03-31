$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SergeiD.feature");
formatter.feature({
  "line": 3,
  "name": "SergeiD test cases",
  "description": "",
  "id": "sergeid-test-cases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SergeiD"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 4225023175,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user is on the practicalsqa.net homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Test001_InterviewQuestionsBBTPage2.user_is_on_the_practicalsqa_net_homepage()"
});
formatter.result({
  "duration": 5464468245,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "TC04 Verify password is NOT required \"Lesson 1\" from the page \"Begginnig Selenium Classes\"",
  "description": "",
  "id": "sergeid-test-cases;tc04-verify-password-is-not-required-\"lesson-1\"-from-the-page-\"begginnig-selenium-classes\"",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "click on the picture \"Beginning Selenium Classes\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "click \"Lesson 1\" link",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user able to see material of the Lesson 1, password not required",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Beginning Selenium Classes",
      "offset": 22
    }
  ],
  "location": "Test001_InterviewQuestionsBBTPage2.click_on_the_picture(String)"
});
formatter.result({
  "duration": 2486440489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lesson 1",
      "offset": 7
    }
  ],
  "location": "Test001_InterviewQuestionsBBTPage2.click_link(String)"
});
formatter.result({
  "duration": 6424086193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "Test001_InterviewQuestionsBBTPage2.user_able_to_see_material_of_the_Lesson_password_not_required(int)"
});
formatter.result({
  "duration": 51088022,
  "status": "passed"
});
formatter.after({
  "duration": 750348616,
  "status": "passed"
});
});
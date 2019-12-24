$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSky.feature");
formatter.feature({
  "line": 2,
  "name": "Darksky feature",
  "description": "",
  "id": "darksky-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@darkSky"
    }
  ]
});
formatter.before({
  "duration": 2720063941,
  "status": "passed"
});
formatter.before({
  "duration": 1549747,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkyHomePageSD.verifyHomePageTitle()"
});
formatter.result({
  "duration": 360562179,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "darksky-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@darkSky-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the darksky Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify error message \"password and username does not match\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSD.clickOnDarkSkyAPI()"
});
formatter.result({
  "duration": 223302492,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.clickOnLoginButton()"
});
formatter.result({
  "duration": 3374398105,
  "status": "passed"
});
formatter.match({
  "location": "MainPageSD.clickOnLogin()"
});
formatter.result({
  "duration": 1162310917,
  "status": "passed"
});
formatter.after({
  "duration": 114080066,
  "status": "passed"
});
formatter.after({
  "duration": 427690,
  "status": "passed"
});
formatter.before({
  "duration": 1856033790,
  "status": "passed"
});
formatter.before({
  "duration": 82482,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkyHomePageSD.verifyHomePageTitle()"
});
formatter.result({
  "duration": 54345397,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "darksky-feature;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@darkSky-2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on DarkSky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I expand todays timeline",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "TimeZoneSD.homePage()"
});
formatter.result({
  "duration": 27847130,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyHomePageSD.clickOnTodayButton()"
});
formatter.result({
  "duration": 1114949219,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyHomePageSD.listHighestAndLowestTemp()"
});
formatter.result({
  "duration": 778133491,
  "status": "passed"
});
formatter.after({
  "duration": 118100642,
  "status": "passed"
});
formatter.after({
  "duration": 126070,
  "status": "passed"
});
formatter.before({
  "duration": 1799011734,
  "status": "passed"
});
formatter.before({
  "duration": 76905,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkyHomePageSD.verifyHomePageTitle()"
});
formatter.result({
  "duration": 33083848,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "darksky-feature;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@darkSky-3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter city into search text field on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I verify city\u0027s time zone",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkyHomePageSD.verifyHomePageTitle()"
});
formatter.result({
  "duration": 88062783,
  "status": "passed"
});
formatter.match({
  "location": "TimeZoneSD.sendTextIntoSearcBox()"
});
formatter.result({
  "duration": 273943658,
  "status": "passed"
});
formatter.match({
  "location": "TimeZoneSD.verifyTimeZone()"
});
formatter.result({
  "duration": 1030558162,
  "status": "passed"
});
formatter.match({
  "location": "TimeZoneSD.IsTimelineDisplayedWithTwoHoursIncremented()"
});
formatter.result({
  "duration": 36432339,
  "status": "passed"
});
formatter.after({
  "duration": 102287666,
  "status": "passed"
});
formatter.after({
  "duration": 232304,
  "status": "passed"
});
});
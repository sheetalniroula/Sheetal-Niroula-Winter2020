$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/colorChangeTowhite.feature");
formatter.feature({
  "line": 1,
  "name": "AS a user I want to click on the set white background button so that the background color changes to blue",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-the-set-white-background-button-so-that-the-background-color-changes-to-blue",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4435017500,
  "status": "passed"
});
formatter.before({
  "duration": 3630642500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "background color can be changed to blue when clicked on set skyblue background button",
  "description": "",
  "id": "as-a-user-i-want-to-click-on-the-set-white-background-button-so-that-the-background-color-changes-to-blue;background-color-can-be-changed-to-blue-when-clicked-on-set-skyblue-background-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is in tehfios test page with the blue skyblue background color",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the user click on the \u0027set white background\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "the background color should be white",
  "keyword": "Then "
});
formatter.match({
  "location": "ColorChangeToWhiteSteps.user_is_in_tehfios_test_page_with_the_blue_skyblue_background_color()"
});
formatter.result({
  "duration": 147524400,
  "status": "passed"
});
formatter.match({
  "location": "ColorChangeToWhiteSteps.the_user_click_on_the_set_white_background_button()"
});
formatter.result({
  "duration": 61847600,
  "status": "passed"
});
formatter.match({
  "location": "ColorChangeToWhiteSteps.the_background_color_should_be_white()"
});
formatter.result({
  "duration": 37767700,
  "status": "passed"
});
formatter.after({
  "duration": 672813700,
  "status": "passed"
});
formatter.after({
  "duration": 672194800,
  "status": "passed"
});
});
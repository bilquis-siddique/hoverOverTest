$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/myFeature.feature");
formatter.feature({
  "name": "Login to WordPress",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to WordPress with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Firefox Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSteps.user_Launch_Firefox_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters username as \"myPractice123\" and pwd as \"Rhj18FoALxAPLe8i\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginSteps.user_Enters_username_as_and_pwd_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Submit Button",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSteps.user_Clicks_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title Should be \"Blog Tool, Publishing Platform, and CMS \u0026mdash; WordPress.org\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.page_Title_Should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Hover over Support and Print All Its Items",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSteps.user_Hover_over_Support_and_Print_All_Its_Items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "loginSteps.user_Close_Browser()"
});
formatter.result({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Day04.feature");
formatter.feature({
  "name": "Smoke Test And Report",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LogIn and gain the report",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser is set and website is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Day04_StepDefination.browser_is_set_and_website_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "someone Entered \"Muhtar.Mahmut0519@yahoo.com\" and \"Mayire007\"",
  "keyword": "When "
});
formatter.match({
  "location": "Day04_StepDefination.someone_Entered_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can log in and then website closes.",
  "keyword": "Then "
});
formatter.match({
  "location": "Day04_StepDefination.user_can_log_in_and_then_website_closes()"
});
formatter.result({
  "status": "passed"
});
});
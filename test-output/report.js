$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Serghei.Matura/eclipse-workspace/MavenCucumber/Features/btn.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Service and Instagram btn",
  "description": "",
  "id": "verify-service-and-instagram-btn",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5951106500,
  "status": "passed"
});
formatter.before({
  "duration": 5410170300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Work with Service and Instagram btn",
  "description": "",
  "id": "verify-service-and-instagram-btn;work-with-service-and-instagram-btn",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Get the url \"https://urchinsys.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click ‘Services’ button from the top",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Verify that the correct URL (https://urchinsys.com/#services) loads",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify that there is ‘Software Development’ information",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click the instagram button from the footer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify that the correct URL (https://www.instagram.com/urchinsys/) loads and verify if the Urchinsys profile is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionBtn.open_the_Web_browser()"
});
formatter.result({
  "duration": 4277792300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://urchinsys.com/",
      "offset": 13
    }
  ],
  "location": "StepDefinitionBtn.get_the_url(String)"
});
formatter.result({
  "duration": 4761329700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBtn.click_Services_button_from_the_top()"
});
formatter.result({
  "duration": 36406200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBtn.verify_that_the_correct_URL_https_urchinsys_com_services_loads()"
});
formatter.result({
  "duration": 4540500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBtn.verify_that_there_is_Software_Development_information()"
});
formatter.result({
  "duration": 23000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBtn.click_the_instagram_button_from_the_footer()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionBtn.verify_that_the_correct_URL_https_www_instagram_com_urchinsys_loads_and_verify_if_the_Urchinsys_profile_is_opened()"
});
formatter.result({
  "duration": 19900,
  "status": "passed"
});
formatter.after({
  "duration": 749756800,
  "status": "passed"
});
formatter.after({
  "duration": 630128800,
  "status": "passed"
});
});
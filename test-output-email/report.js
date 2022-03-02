$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Serghei.Matura/eclipse-workspace/MavenCucumber/Features/email.feature");
formatter.feature({
  "line": 1,
  "name": "Sent a question to the Website",
  "description": "",
  "id": "sent-a-question-to-the-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Try to send a question with an invalid email",
  "description": "",
  "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL \"https://urchinsys.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Find ‘Get your questions answered! ’ and click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter name and questions",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter 3 invalid email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click send button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User see an message error",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 13,
      "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;1"
    },
    {
      "cells": [
        "sadsad@"
      ],
      "line": 14,
      "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;2"
    },
    {
      "cells": [
        "kgjhhg@khjg"
      ],
      "line": 15,
      "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;3"
    },
    {
      "cells": [
        "sfds@as.c."
      ],
      "line": 16,
      "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Try to send a question with an invalid email",
  "description": "",
  "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL \"https://urchinsys.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Find ‘Get your questions answered! ’ and click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter name and questions",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter 3 invalid email \"sadsad@\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click send button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User see an message error",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 18
    }
  ],
  "location": "StepDefinitionsforEmail.open_the_browser(String)"
});
formatter.result({
  "duration": 10235976500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://urchinsys.com/",
      "offset": 15
    }
  ],
  "location": "StepDefinitionsforEmail.enter_the_URL(String)"
});
formatter.result({
  "duration": 3676031100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.find_Get_your_questions_answered_and_click()"
});
formatter.result({
  "duration": 79094800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.enter_name_and_questions()"
});
formatter.result({
  "duration": 1884808100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    },
    {
      "val": "sadsad@",
      "offset": 23
    }
  ],
  "location": "StepDefinitionsforEmail.enter_invalid_email(int,String)"
});
formatter.result({
  "duration": 52138800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.click_send_button()"
});
formatter.result({
  "duration": 24967800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.user_see_an_message_error()"
});
formatter.result({
  "duration": 1032968800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Try to send a question with an invalid email",
  "description": "",
  "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL \"https://urchinsys.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Find ‘Get your questions answered! ’ and click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter name and questions",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter 3 invalid email \"kgjhhg@khjg\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click send button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User see an message error",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 18
    }
  ],
  "location": "StepDefinitionsforEmail.open_the_browser(String)"
});
formatter.result({
  "duration": 9635118200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://urchinsys.com/",
      "offset": 15
    }
  ],
  "location": "StepDefinitionsforEmail.enter_the_URL(String)"
});
formatter.result({
  "duration": 3795852800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.find_Get_your_questions_answered_and_click()"
});
formatter.result({
  "duration": 59141800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.enter_name_and_questions()"
});
formatter.result({
  "duration": 1823242400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    },
    {
      "val": "kgjhhg@khjg",
      "offset": 23
    }
  ],
  "location": "StepDefinitionsforEmail.enter_invalid_email(int,String)"
});
formatter.result({
  "duration": 64562300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.click_send_button()"
});
formatter.result({
  "duration": 22091800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.user_see_an_message_error()"
});
formatter.result({
  "duration": 1023355200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Try to send a question with an invalid email",
  "description": "",
  "id": "sent-a-question-to-the-website;try-to-send-a-question-with-an-invalid-email;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser \"Chrome\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL \"https://urchinsys.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Find ‘Get your questions answered! ’ and click",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter name and questions",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter 3 invalid email \"sfds@as.c.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click send button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User see an message error",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 18
    }
  ],
  "location": "StepDefinitionsforEmail.open_the_browser(String)"
});
formatter.result({
  "duration": 9671354700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://urchinsys.com/",
      "offset": 15
    }
  ],
  "location": "StepDefinitionsforEmail.enter_the_URL(String)"
});
formatter.result({
  "duration": 3690678900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.find_Get_your_questions_answered_and_click()"
});
formatter.result({
  "duration": 65456100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.enter_name_and_questions()"
});
formatter.result({
  "duration": 1830968100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    },
    {
      "val": "sfds@as.c.",
      "offset": 23
    }
  ],
  "location": "StepDefinitionsforEmail.enter_invalid_email(int,String)"
});
formatter.result({
  "duration": 58760500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.click_send_button()"
});
formatter.result({
  "duration": 23120600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsforEmail.user_see_an_message_error()"
});
formatter.result({
  "duration": 1010319800,
  "status": "passed"
});
});
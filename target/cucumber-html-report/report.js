$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Java/CucumberWithoutMaven/Features/Mercury_Datatable.feature");
formatter.feature({
  "line": 2,
  "name": "test the Mercury login",
  "description": "",
  "id": "test-the-mercury-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9392519600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to MercuryTours",
  "description": "",
  "id": "test-the-mercury-login;login-to-mercurytours",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is navigating to MercuryTours Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "validate the mercury title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate the mercury logo",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User need to enter username and password and click on login button",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 10
    },
    {
      "cells": [
        "neeli",
        "neeli"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MercuryLogin.InvokeMercuryToursApp()"
});
formatter.result({
  "duration": 101431600,
  "status": "passed"
});
formatter.match({
  "location": "MercuryLogin.verifyMercuryTourstitle()"
});
formatter.result({
  "duration": 9064400,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Welcome: Mercury Tours]\u003e but was:\u003c[Google]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat Stepdefinition.MercuryLogin.verifyMercuryTourstitle(MercuryLogin.java:54)\r\n\tat ✽.Then validate the mercury title(F:/Java/CucumberWithoutMaven/Features/Mercury_Datatable.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MercuryLogin.verifymercuryLogo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MercuryLogin.user_need_to_enter_username_and_password_and_click_on_login_button(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1593435100,
  "status": "passed"
});
});
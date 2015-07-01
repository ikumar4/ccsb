$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginBrain.feature");
formatter.feature({
  "line": 1,
  "name": "Login and Create Variant on Cengage Brain",
  "description": "",
  "id": "login-and-create-variant-on-cengage-brain",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to log-in and Create variant",
  "description": "",
  "id": "login-and-create-variant-on-cengage-brain;user-should-be-able-to-log-in-and-create-variant",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@brainlogin"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on Cengage Brain log-in screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter valid credential",
  "rows": [
    {
      "cells": [
        "Fields",
        "value"
      ],
      "line": 7
    },
    {
      "comments": [
        {
          "line": 8,
          "value": "#   | emailId  | Ishtestinstructor@test.cengage.com |"
        },
        {
          "line": 9,
          "value": "#   | password | Password1                          |"
        }
      ],
      "cells": [
        "emailId",
        "ish.kumar@contractor.cengage.com"
      ],
      "line": 10
    },
    {
      "cells": [
        "password",
        "Q2VuZ2FnZTE\u003d"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "# | emailId  | vinay.thakur@contractor.cengage.com |"
    },
    {
      "line": 13,
      "value": "#  | password | Techizen_123 |"
    }
  ],
  "line": 14,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User is logged in successfully \"Instructor SSO - Instructor Resource Center\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Select the product from drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Create Course link",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Select the Radio button for create new course",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Enter all required details",
  "rows": [
    {
      "cells": [
        "Fields",
        "value"
      ],
      "line": 20
    },
    {
      "cells": [
        "courseName",
        "ish_Test"
      ],
      "line": 21
    },
    {
      "cells": [
        "beginDate",
        "dateFormat.format(date)"
      ],
      "line": 22
    },
    {
      "cells": [
        "endDate",
        "10/30/2016"
      ],
      "line": 23
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Click on Create Course",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User is logged in successfully \"Instructor SSO - Create Course Confirmation\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Course key is generated and captured",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Logout from Cengage Brain",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationB.loginpage()"
});
formatter.result({
  "duration": 7680068019,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.logincredential(DataTable)"
});
formatter.result({
  "duration": 1267392271,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.loginbutton()"
});
formatter.result({
  "duration": 62733441694,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Instructor SSO - Instructor Resource Center",
      "offset": 32
    }
  ],
  "location": "StepDefinationB.logintitle(String)"
});
formatter.result({
  "duration": 2898403734,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.productselection()"
});
formatter.result({
  "duration": 1194421153,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.createcorusemaster()"
});
formatter.result({
  "duration": 2159579530,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.newcourse()"
});
formatter.result({
  "duration": 908853835,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.fillform(DataTable)"
});
formatter.result({
  "duration": 2590784616,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.Click_on_Create_Course()"
});
formatter.result({
  "duration": 63815624422,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Instructor SSO - Create Course Confirmation",
      "offset": 32
    }
  ],
  "location": "StepDefinationB.logintitle(String)"
});
formatter.result({
  "duration": 2313836770,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.coursekeycapture()"
});
formatter.result({
  "duration": 58248038,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationB.brainlogout()"
});
formatter.result({
  "duration": 13700635654,
  "status": "passed"
});
formatter.uri("OlrLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login to OLR Application",
  "description": "",
  "id": "login-to-olr-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to OLR and Validate CGI",
  "description": "",
  "id": "login-to-olr-application;login-to-olr-and-validate-cgi",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@olrlogin"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Login page of OLR",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter credentials as below",
  "rows": [
    {
      "cells": [
        "Field",
        "Value"
      ],
      "line": 6
    },
    {
      "cells": [
        "userName",
        "ish.kumar@contractor.cengage.com"
      ],
      "line": 7
    },
    {
      "cells": [
        "password",
        "Q2VuZ2FnZTE\u003d"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on log-in button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User is logged in successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Navigate to Course frame",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter the Course key",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Grep the CGI",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Write the CGI in Excel",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinationO.loginolr()"
});
formatter.result({
  "duration": 2844129840,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.usernamepassword(DataTable)"
});
formatter.result({
  "duration": 1580326348,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.ologinbutton()"
});
formatter.result({
  "duration": 104638793,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.User_is_logged_in_successfully()"
});
formatter.result({
  "duration": 38120,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.ocurseclick()"
});
formatter.result({
  "duration": 692105642,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.entercoursekey()"
});
formatter.result({
  "duration": 381582442,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.grepcgi()"
});
formatter.result({
  "duration": 367008742452,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinationO.wexcel()"
});
formatter.result({
  "duration": 260919333,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 169765,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#  Scenario: Test"
    },
    {
      "line": 4,
      "value": "#    Given Test"
    }
  ],
  "line": 6,
  "name": "Test2",
  "description": "",
  "id": "test;test2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Test2",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.test2()"
});
formatter.result({
  "duration": 8181527437,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ation Tools Tutorial[]\u003e but was:\u003c...ation Tools Tutorial[2]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat steps.TestSteps.test2(TestSteps.java:61)\r\n\tat ✽.Given Test2(test.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 342902685,
  "status": "passed"
});
formatter.after({
  "duration": 1015609691,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 220544,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test",
  "description": "",
  "id": "test;test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Test",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps.test()"
});
formatter.result({
  "duration": 9689421521,
  "status": "passed"
});
formatter.after({
  "duration": 91043,
  "status": "passed"
});
formatter.after({
  "duration": 818709935,
  "status": "passed"
});
formatter.before({
  "duration": 36657,
  "status": "passed"
});
formatter.scenario({
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
  "duration": 7002176300,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ation Tools Tutorial[]\u003e but was:\u003c...ation Tools Tutorial[2]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat steps.TestSteps.test2(TestSteps.java:57)\r\n\tat ✽.Given Test2(test.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 661406047,
  "status": "passed"
});
formatter.after({
  "duration": 658041990,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
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
  "duration": 6617425100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ation Tools Tutorial[]\u003e but was:\u003c...ation Tools Tutorial[2]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat steps.TestSteps.test(TestSteps.java:42)\r\n\tat ✽.Given Test(test.feature:4)\r\n",
  "status": "failed"
});
});
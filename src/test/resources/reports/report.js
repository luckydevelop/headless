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
  "duration": 5336920136,
  "status": "passed"
});
});
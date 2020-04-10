$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ui/search.feature");
formatter.feature({
  "name": "Search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Search a product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I have browser opened and url is navigated",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchStepDefs.i_have_browser_opened_and_url_is_navigated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for product \"Dell\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefs.i_search_for_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product list should appear pertaining to the product search as \"Dell\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDefs.product_list_should_appear_pertaining_to_the_product_search_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
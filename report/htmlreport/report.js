$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/coupon.feature");
formatter.feature({
  "name": "Verify Create , Edit and Delete Coupon",
  "description": "  I need to create a coupon and then Edit and Delete the same coupon with Auto-Generated Coupon Code",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create a Coupon with all inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Assignment1"
    }
  ]
});
formatter.step({
  "name": "User navigates to coupon page",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Add new Coupon",
  "keyword": "And "
});
formatter.step({
  "name": "Verify user is navigated to Create coupon screen",
  "keyword": "Then "
});
formatter.step({
  "name": "Add a new coupon with all Inputs \"\u003ccoupon_name\u003e\", \"\u003ctype\u003e\", \"\u003cdiscount\u003e\",\"\u003camount\u003e\",\"\u003ccust_login\u003e\",\"\u003cfree_shipping\u003e\",\"\u003cproducts\u003e\",\"\u003ccategory\u003e\",\"\u003cstart_date\u003e\",\"\u003cend_date\u003e\",\"\u003cuse_per_coupon\u003e\",\"\u003cuse_per_cust\u003e\",\"\u003cstatus\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify coupon is added \"\u003ccoupon_name\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "coupon_name",
        "type",
        "discount",
        "amount",
        "cust_login",
        "free_shipping",
        "products",
        "category",
        "start_date",
        "end_date",
        "use_per_coupon",
        "use_per_cust",
        "status"
      ]
    },
    {
      "cells": [
        "IBM FST",
        "Percentage",
        "10",
        "1000",
        "Yes",
        "Yes",
        "All",
        "All",
        "2022-05-26",
        "2022-06-26",
        "1",
        "1",
        "Enabled"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksClass.user_navigated_to_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "HooksClass.enter_Username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksClass.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a Coupon with all inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Assignment1"
    }
  ]
});
formatter.step({
  "name": "User navigates to coupon page",
  "keyword": "When "
});
formatter.match({
  "location": "CouponsStepDefinition.user_navigates_to_coupon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add new Coupon",
  "keyword": "And "
});
formatter.match({
  "location": "CouponsStepDefinition.click_on_Add_new_Coupon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is navigated to Create coupon screen",
  "keyword": "Then "
});
formatter.match({
  "location": "CouponsStepDefinition.verify_user_is_navigated_to_Create_coupon_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add a new coupon with all Inputs \"IBM FST\", \"Percentage\", \"10\",\"1000\",\"Yes\",\"Yes\",\"All\",\"All\",\"2022-05-26\",\"2022-06-26\",\"1\",\"1\",\"Enabled\"",
  "keyword": "And "
});
formatter.match({
  "location": "CouponsStepDefinition.add_a_new_coupon_with_all_Inputs(String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify coupon is added \"IBM FST\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CouponsStepDefinition.verify_coupon_is_added(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Edit the same Coupon with all inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Assignment1"
    }
  ]
});
formatter.step({
  "name": "User navigates to coupon page",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Edit coupon code",
  "keyword": "And "
});
formatter.step({
  "name": "Verify user is navigated to Edit coupon screen",
  "keyword": "Then "
});
formatter.step({
  "name": "Edit a coupon with all Inputs \"\u003ccoupon_name\u003e\" ,\"\u003ctype\u003e\", \"\u003cdiscount\u003e\",\"\u003camount\u003e\",\"\u003ccust_login\u003e\",\"\u003cfree_shipping\u003e\",\"\u003cproducts\u003e\",\"\u003ccategory\u003e\",\"\u003cstart_date\u003e\",\"\u003cend_date\u003e\",\"\u003cuse_per_coupon\u003e\",\"\u003cuse_per_cust\u003e\",\"\u003cstatus\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Verify coupon is edited \"\u003ccoupon_name\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "coupon_name",
        "type",
        "discount",
        "amount",
        "cust_login",
        "free_shipping",
        "products",
        "category",
        "start_date",
        "end_date",
        "use_per_coupon",
        "use_per_cust",
        "status"
      ]
    },
    {
      "cells": [
        "IBM FST",
        "Percentage",
        "20",
        "2000",
        "Yes",
        "Yes",
        "All",
        "All",
        "2022-05-26",
        "2022-06-26",
        "1",
        "1",
        "Enabled"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksClass.user_navigated_to_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "HooksClass.enter_Username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksClass.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit the same Coupon with all inputs",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Assignment1"
    }
  ]
});
formatter.step({
  "name": "User navigates to coupon page",
  "keyword": "When "
});
formatter.match({
  "location": "CouponsStepDefinition.user_navigates_to_coupon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Edit coupon code",
  "keyword": "And "
});
formatter.match({
  "location": "CouponsStepDefinition.click_on_Edit_coupon_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify user is navigated to Edit coupon screen",
  "keyword": "Then "
});
formatter.match({
  "location": "CouponsStepDefinition.verify_user_is_navigated_to_Edit_coupon_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit a coupon with all Inputs \"IBM FST\" ,\"Percentage\", \"20\",\"2000\",\"Yes\",\"Yes\",\"All\",\"All\",\"2022-05-26\",\"2022-06-26\",\"1\",\"1\",\"Enabled\"",
  "keyword": "And "
});
formatter.match({
  "location": "CouponsStepDefinition.edit_a_coupon_with_all_Inputs(String,String,String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify coupon is edited \"IBM FST\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CouponsStepDefinition.verify_coupon_is_edited(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to the Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HooksClass.user_navigated_to_the_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "HooksClass.enter_Username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksClass.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete the same Coupon",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Assignment1"
    }
  ]
});
formatter.step({
  "name": "User navigates to coupon page",
  "keyword": "When "
});
formatter.match({
  "location": "CouponsStepDefinition.user_navigates_to_coupon_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select a coupon code to delete based on coupon code",
  "keyword": "And "
});
formatter.match({
  "location": "CouponsStepDefinition.select_a_coupon_code_to_delete_based_on_coupon_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete a coupon",
  "keyword": "Then "
});
formatter.match({
  "location": "CouponsStepDefinition.delete_a_coupon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify coupon is deleted",
  "keyword": "And "
});
formatter.match({
  "location": "CouponsStepDefinition.verify_coupon_is_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
Feature: Verify Create Edit and Delete Coupon
  I need to create a coupon and Edit and Delete the same coupon

  Background: 
    Given User navigated to the Login page
    And Enter Username "admin" and password "Admin@123"
    Then User should be able to login

 
  @Assignment1
  Scenario Outline: Create a Coupon with all inputs
    When User navigates to coupon page
    And Click on Add new Coupon
    Then Verify user is navigated to Create coupon screen
    And Add a new coupon with all Inputs "<coupon_name>" , "<coupon_code>" , "<type>", "<discount>","<amount>","<cust_login>","<free_shipping>","<products>","<category>","<start_date>","<end_date>","<use_per_coupon>","<use_per_cust>","<status>"
    Then Verify coupon is added

    Examples: 
      | coupon_name | coupon_code | type       | discount | amount | cust_login | free_shipping | products | category | start_date | end_date   | use_per_coupon | use_per_cust | status  |
      | AAutomation | PRITHIGA    | Percentage |       10 |   1000 | Yes        | Yes           | All      | All      | 2022-05-26 | 2022-06-26 |              1 |            1 | Enabled |

  @Assignment1
  Scenario Outline: Edit a Coupon with all inputs
    When User navigates to coupon page
    And Click on Edit coupon code "<coupon_code_to_Edit>"
    Then Verify user is navigated to Edit coupon screen
    And Edit a coupon with all Inputs "<coupon_name>" , "<coupon_code>" , "<type>", "<discount>","<amount>","<cust_login>","<free_shipping>","<products>","<category>","<start_date>","<end_date>","<use_per_coupon>","<use_per_cust>","<status>"
    Then Verify coupon is edited

    Examples: 
      | coupon_code_to_Edit | coupon_name | coupon_code   | type       | discount | amount | cust_login | free_shipping | products | category | start_date | end_date   | use_per_coupon | use_per_cust | status  |
      | PRITHIGA            | AAutomation | PRI_EDIT | Percentage |       20 |   2000 | Yes        | Yes           | All      | All      | 2022-05-26 | 2022-06-26 |              1 |            1 | Enabled |

  @Assignment1
  Scenario Outline: Delete a Coupon
    When User navigates to coupon page
    And Select a coupon code to delete based on coupon code "<coupon_code_to_delete>"
    Then Delete a coupon
    And Verify coupon is deleted

    Examples: 
      | coupon_code_to_delete |
      | PRI_EDIT         |

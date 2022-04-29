Feature: Verify Create , Edit and Delete Coupon
  I need to create a coupon and then Edit and Delete the same coupon with Auto-Generated Coupon Code

  Background: 
    Given User navigated to the Login page
    And Enter Username and Password
    Then User should be able to login

  @Assignment1
  Scenario Outline: Create a Coupon with all inputs
    When User navigates to coupon page
    And Click on Add new Coupon
    Then Verify user is navigated to Create coupon screen
    And Add a new coupon with all Inputs "<coupon_name>", "<type>", "<discount>","<amount>","<cust_login>","<free_shipping>","<products>","<category>","<start_date>","<end_date>","<use_per_coupon>","<use_per_cust>","<status>"
    Then Verify coupon is added "<coupon_name>"

    Examples: 
      | coupon_name | type       | discount | amount | cust_login | free_shipping | products | category | start_date | end_date   | use_per_coupon | use_per_cust | status  |
      | IBM FST     | Percentage |       10 |   1000 | Yes        | Yes           | All      | All      | 2022-05-26 | 2022-06-26 |              1 |            1 | Enabled |

  @Assignment1
  Scenario Outline: Edit the same Coupon with all inputs
    When User navigates to coupon page
    And Click on Edit coupon code
    Then Verify user is navigated to Edit coupon screen
    And Edit a coupon with all Inputs "<coupon_name>" ,"<type>", "<discount>","<amount>","<cust_login>","<free_shipping>","<products>","<category>","<start_date>","<end_date>","<use_per_coupon>","<use_per_cust>","<status>"
    Then Verify coupon is edited "<coupon_name>"

    Examples: 
      | coupon_name | type       | discount | amount | cust_login | free_shipping | products | category | start_date | end_date   | use_per_coupon | use_per_cust | status  |
      | IBM FST     | Percentage |       20 |   2000 | Yes        | Yes           | All      | All      | 2022-05-26 | 2022-06-26 |              1 |            1 | Enabled |

  @Assignment1
  Scenario: Delete the same Coupon
    When User navigates to coupon page
    And Select a coupon code to delete based on coupon code
    Then Delete a coupon
    And Verify coupon is deleted

#
#Feature: Validate Login functionalities
#  I want to use this template for my feature file
#
#	@demo
#  Scenario Outline: Valid Login
#    Given I open the url "https://shop.demoqa.com"
#    When I set "xxxxx@gmail.com" to the inputfield "loc_txt_username"
#    When I set "xxxxxxx" to the inputfield "loc_txt_password"
#    When I click on the button "loc_btn_login"
#    Then I expect that element "loc_toast_message" matches the text "SUCCESS!\nUser Login Successfful"


Feature: Validate Login functionalities  # Feature title

  @Test  # Add a tag (optional)
  Scenario Outline: Valid Login with different user credentials  # Scenario Outline for multiple login attempts
    Given user is on home page
    When he search for "&post_type=product"
    When choose to buy the first item
    When moves to check the mini cart
    When enter personal details on checkout page
    When place the order
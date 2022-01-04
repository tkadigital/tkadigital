Feature: OrangeHRM Logo
  Scenario: Logo & Login working in OrangeHRM homepage
    Given I launch chrome browser
    When I open OrangeHRM home Page
    Then I Verify logo present on page
    Then I Verify login name & password on Login-page
    And Close chrome browser
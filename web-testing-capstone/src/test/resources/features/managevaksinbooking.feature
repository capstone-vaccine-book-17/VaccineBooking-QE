@ManageVaksin
Feature: Manage Vaksin Booking
  As a admin
  I want to manage vaccine booking
  So i can manage vaccine booking

  Scenario: Menampilkan halaman manage booking
    Given I am on login page
    When I am input username
    And I am input password
    And click login button
    And I click manage booking button
    Then I can see the booking page
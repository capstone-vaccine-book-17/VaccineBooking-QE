@AddFamilyMembers
Feature: Add Family members
  As a user
  I want to add my family
  So i can add my family

  Scenario: Add family member in profil page
    Given I am on the login page
    When I click login button
    And I input email
    And I input password
    And I click login
    And I click profile menu
    And I click anggota keluarga
    And I click tambah button
    Then I succes open tambah anggota keluarga
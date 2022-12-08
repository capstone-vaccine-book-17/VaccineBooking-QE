@Register
Feature: Register
  As a user
  I want to create account
  So i can booking vaccine

  Scenario: Register with valid nama, valid nik, valid tanggal lahir, valid alamat,valid email, valid jenis kelamin, valid password
    Given I am on the login page
    When I click register button
    And I input valid nama
    And I input valid nik
    And I input valid tanggal lahir
    And I input valid alamat
    And I input valid email
    And I input valid jenis kelamin
    And I input valid password
    And I click register
    Then I succes create my account
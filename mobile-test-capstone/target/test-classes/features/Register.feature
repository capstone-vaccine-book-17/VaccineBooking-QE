@Register
Feature: Register
  As a user
  I want to create account
  So i can booking vaccine

 Scenario Outline: Register with valid nama, valid nik, valid tanggal lahir, valid alamat,valid email, valid jenis kelamin, valid password
    Given I am on the login page
    When I click register button
    And I input nama "<nama>"
    And I input nik "<nik>"
    And I input tanggal lahir "<dob>"
    And I input alamat "<alamat>"
    And I input email "<email>"
    And I input jenis kelamin "<gender>"
    And I input password "<password>"
    And I click register
    Then I succes create my account
   Examples:
   |nama|nik|dob|alamat|email|gender|password|
   |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
   | | | | | | | |
   |Adi Subakti| | | | | | |
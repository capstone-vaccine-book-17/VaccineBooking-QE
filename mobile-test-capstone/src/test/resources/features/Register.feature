@Register
Feature: Register
  As a user
  I want to create account
  So i can booking vaccine

 Scenario Outline: Register nama, nik, tanggal lahir, alamat, email, jenis kelamin, password
    Given I am on the login page
    When I click register button
    And I input nama "<nama>"
    And I input nik "<nik>"
    And I input alamat "<alamat>"
    And I input jenis kelamin "<gender>"
    And I input tanggal lahir "<dob>"
    And I input email "<email>"
    And I input password "<password>"
    And I click register
    Then I get "<result>" result regist
   Examples:
   |nama|nik|dob|alamat|email|gender|password|result|
   |Adi Subakti|3245621457853789|05/05/1995|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|123456|can regis|

   Scenario: Register with tombol daftar di login page
     Given I am on the login page
     When I click login button
     And I click daftar button
     Then I Succes open register page
Feature: Register
  As a user
  I want to create account
  So i can create new account

  Scenario Outline: Register nama, nik, tanggal lahir, alamat, email, jenis kelamin, password
    Given I set url register
    When I input nama "<nama>"
    And I input nik "<nik>"
    And I input tanggal lahir "<dob>"
    And I input alamat "<alamat>"
    And I input email "<email>"
    And I input jenis kelamin "<gender>"
    And I input password "<password>"
    Then I will get status code
    Examples:
    |nama|nik|dob|alamat|email|gender|password|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    | | | | | | | |
    |Adi Subakti| | | | | | |
    |Adi Subakti|3245621457853789| | | | | |
    |Adi Subakti|3245621457853789|1995-05-05| | | | |
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman| | | |
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com| | |
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki| |
    | | | | | | |12345|
    | | | | | |Laki-Laki|12345|
    | | | | |subakti@gmail.com|Laki-Laki|12345|
    | | | |Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    | | |1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    | |3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Pria|123|
    |AAAAAAA| | | | | | |
    |AAAAAAA|123| | | | | |
    |AAAAAAA|123|0000-00-00| | | | |
    |AAAAAAA|123|0000-00-00|Jln| | | |
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com| | |
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Pria| |
    | | | | | | |123|
    | | | | | |Pria|123|
    | | | | |@gmail.com|Pria|123|
    | | | |Jln|@gmail.com|Pria|123|
    | | |0000-00-00|Jln|@gmail.com|Pria|123|
    | |123|0000-00-00|Jln|@gmail.com|Pria|123|
    |AAAAAAA|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    |AAAAAAA|123|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    |AAAAAAA|123|0000-00-00|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|
    |AAAAAAA|123|0000-00-00|Jln|subakti@gmail.com|Laki-Laki|12345|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Laki-Laki|12345|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Pria|12345|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|123|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Pria|123|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|@gmail.com|Pria|123|
    |Adi Subakti|3245621457853789|1995-05-05|Jln|@gmail.com|Pria|123|
    |Adi Subakti|3245621457853789|0000-00-00|Jln|@gmail.com|Pria|123|
    |Adi Subakti|123|0000-00-00|Jln|@gmail.com|Pria|123|

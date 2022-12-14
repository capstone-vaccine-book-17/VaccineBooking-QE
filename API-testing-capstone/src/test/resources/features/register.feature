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
    And I input password "<password>" and do request
    Then I will get status code <statuscode>
    Examples:
    |nama|nik|dob|alamat|email|gender|password|statuscode|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    | | | | | | | |200|
    |Adi Subakti| | | | | | |200|
    |Adi Subakti|3245621457853789| | | | | |200|
    |Adi Subakti|3245621457853789|1995-05-05| | | | |200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman| | | |200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com| | |200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki| |200|
    | | | | | | |12345|200|
    | | | | | |Laki-Laki|12345|200|
    | | | | |subakti@gmail.com|Laki-Laki|12345|200|
    | | | |Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    | | |1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    | |3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Pria|123|200|
    |AAAAAAA| | | | | | |200|
    |AAAAAAA|123| | | | | |200|
    |AAAAAAA|123|0000-00-00| | | | |200|
    |AAAAAAA|123|0000-00-00|Jln| | | |200|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com| | |200|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Pria| |200|
    | | | | | | |123|200|
    | | | | | |Pria|123|200|
    | | | | |@gmail.com|Pria|123|200|
    | | | |Jln|@gmail.com|Pria|123|200|
    | | |0000-00-00|Jln|@gmail.com|Pria|123|200|
    | |123|0000-00-00|Jln|@gmail.com|Pria|123|200|
    |AAAAAAA|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    |AAAAAAA|123|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    |AAAAAAA|123|0000-00-00|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|12345|200|
    |AAAAAAA|123|0000-00-00|Jln|subakti@gmail.com|Laki-Laki|12345|200|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Laki-Laki|12345|200|
    |AAAAAAA|123|0000-00-00|Jln|@gmail.com|Pria|12345|200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Laki-Laki|123|200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|subakti@gmail.com|Pria|123|200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln Jendral Sudirman|@gmail.com|Pria|123|200|
    |Adi Subakti|3245621457853789|1995-05-05|Jln|@gmail.com|Pria|123|200|
    |Adi Subakti|3245621457853789|0000-00-00|Jln|@gmail.com|Pria|123|200|
    |Adi Subakti|123|0000-00-00|Jln|@gmail.com|Pria|123|200|

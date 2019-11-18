Feature: Kalkulator Komplek
  Uji pertama untuk gabungan arimatika dasar

  Background: Sebuah Kalkulator
    Given sebuah kalkulator yang baru dihidupkan

  Scenario Outline: Beberapa operasi aritmatika
    Given beberapa operasi awal:
      | first | second | operation |
      | 5     | 4      | +         |
      | 2     | 1      | +         |
    When Saya tekan 'x' lalu tekan <a>
    And Saya tekan '/' lalu tekan <b>
    And Saya tekan =
    Then hasil akhir adalah <c>

    Examples: Single digits
      | a | b | c  |
      | 1 | 2 | 6  |
      | 2 | 3 | 8 |

    Examples: Double digits
      | a  | b  | c  |
      | 10 | 20 | 6  |
      | 20 | 30 | 8  |

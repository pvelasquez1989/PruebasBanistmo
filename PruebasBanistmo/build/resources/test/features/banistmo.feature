Feature: Open the banistmo page
  An user wants to see tarifario

  @Banistmo @TestCase1
  Scenario: Seccesful Case
  Narrative: open a file pdf of costs at deposit acounts
    Given the user need to enter the banistmo page
    When the user search the tariff option
    Then the user should see the file pdf correctly
@regression
Feature: Search Used Cars functionality
  @sanity
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When  I mouse hover  on "buy+sell" tab
    And   I click 'Used' link
    Then I navigate to 'Used Cars For Sale' page
    And  I select make "<make>"
    And  I select model "<model>"
    And  I select location "<location>"
    And  I select price "<price>"
    And  I click on Find My Next Car tab
   Then I should see the verifyMessage "<VerifyMessage>" in results

Examples:
  | make         | model           | location           | price    | VerifyMessage                                           |
  | Audi         | Q7              | NSW - Central West | $50,000  | 43 Used Audi Q7s for Sale under $50,000 in Central West, NSW|
  | BMW          | 7 Series        | WA - Perth         | $60,000  | 3 Used BMW 7 Series for Sale under $60,000 in Perth, WA     |
  | Ford         | Mustang         | WA - Country East  | $70,000  | 59 Used Ford Mustangs for Sale under $70,000 in Country East, WA |
  | Honda        | Accord          | SA - Murray        | $80,000  | 8 Used Honda Accords for Sale under $80,000 in Murray, SA    |
  | Jeep         | Compass         | NSW - Sydney       | $150000  | 17 Used Jeep Compass for Sale under $150,000 in Sydney, NSW |
  | Kia          |   Rio           | NT - North         | $100,000 | 4 Used Kia Rios for Sale under $100,000 in North, NT |
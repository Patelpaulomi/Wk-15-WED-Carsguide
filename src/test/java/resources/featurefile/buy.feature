
@regression
Feature: Search functionality
@sanity
 Scenario Outline: Search the buy car with model
    Given I am on homepage
    When  I mouse hover on "buy+sell" tab
    And   I click 'Search Cars' link
    Then  I navigate to 'new and used car search' page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select location "<location>"
    And   I select price "<price>"
    And   I click on Find My Next Car tab
    Then  I should see the Verify Message "<VerifyMessage>" in results

    Examples:

      | make         | model           | location           | price    | VerifyMessage                                                      |
      | Audi         | Q7              | NSW - Central West | $50,000  | 43 Audi Q7s for Sale under $50,000 in Central West, NSW            |
      | BMW          | 7 Series        | WA - Perth         | $60,000  | 3 BMW 7 Series for Sale under $60,000 in Perth, WA                 |
      | Ford         | Mustang         | WA - Country East  | $70,000  | 65 Ford Mustangs for Sale under $70,000 in Country East, WA        |
      | Honda        | Accord          | SA - Murray        | $80,000  | 10 Honda Accords for Sale under $80,000 in Murray, SA              |
      | Kia          |  Rondo          | NSW-Sydney         | $150000  |  2 Kia Rondos for Sale under $150,000 in Sydney, NSW               |
      | Land Rover   | Discovery Sport | NT - North         | $100,000 | 2 Land Rover Discovery Sports for Sale under $100,000 in North, NT |
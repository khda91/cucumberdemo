@MultiBefore
Feature: Cucumber Example

  @multiBefore1
  Scenario: Login verification
    Given I open EPAM JDI site
    When I login as user 'epam1' with password '1234'
    Then User name should be 'PITER CHAILOVSKII'

  @multiBefore2
  Scenario: Login verification
    Given I open EPAM JDI site
    When I login as user 'epam' with password '1234'
    Then User name should be 'PITER CHAILOVSKII'
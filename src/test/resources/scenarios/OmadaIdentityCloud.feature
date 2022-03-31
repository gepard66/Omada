Feature: Omada Identity Cloud

  Background:
    Given I am on home page

  Scenario: Go to Omada Identity Cloud via header and check if site was loaded
    When  I go to OMADA_IDENTITY_CLOUD via header
    Then  I am on OMADA_IDENTITY_CLOUD page

  Scenario: Go to Omada Identity Cloud via footer and check if site was loaded
    When  I go to OMADA_IDENTITY_CLOUD via footer
    Then  I am on OMADA_IDENTITY_CLOUD page
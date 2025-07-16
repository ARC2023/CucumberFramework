@manage
Feature: Manage External Accounts

  Scenario: User views and manages external accounts
    Given the user is on the Manage External Accounts page
    Then the page header should be "MANAGE EXTERNAL ACCOUNTS"
    And the user should see the bank account information
    And the account number should be displayed
    And the routing number should be displayed
    And the account status should be Active
    When the user clicks on Add External Account
    Then a new account form should be displayed
    When the user clicks on Edit Account Name
    Then the account name edit option should be available

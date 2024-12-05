Feature: SignUp functionality
      @SignUp
      Scenario: verify user is able to signup with valid credentials
      Given If user is on homepage
      When  click on signup link
      And   enter valid personal information
      And   click create an account button
      Then   verify user should create an account successfully
Feature: Join Us Form

  @tag1
  Scenario Outline: Verify that when the user clicks contact link,join us form opens and when user clicks register button after entering valid fields,confirmation message will display.
    Given Already opened the website protrainingtech.com
    When User clicks the link Contact
    Then User able to see Join Us Form.
    When User enter the value of "<First Name>"
    And User enters the value of "<Last Name>"
    And User enters the email "<Email>"
    And User enters the phone "<phone>"
    And User clicks the register button
    Then User able to see confirmation message

    Examples: 
      | First Name | Last Name | Email          | phone      |
      | John       | Doe       | john@gmail.com | 2406120000 |

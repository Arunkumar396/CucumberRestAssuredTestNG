Feature: Nowkari Profile Update
  I want to update my profile.

  Scenario Outline: Delete and add the nowkari profile key skill
    Given I navigate to nowkari website
    And I enter email id "<Email>"
    When I enter password "<Password>"
    And I clicked on login button
    And I clicked on view profile
    Then I clicked on key skill edit button
    And I deleted SQL keySkill
    And I save and verified sucess message
    Then I clicked on key skill edit button
    And I add keySkill "<Keyskill>"
    And I save and verified sucess message
    Then I clicked on logout button
    And I verified sucessfully logout

    Examples: 
      | Email                          | Password  |Keyskill|
      | arun.shankar5959@gmail.com     | Arun@396  |SQL     |


Feature: Github Challenge

  Scenario: Functional tests for the home page and repository page on GitHub. Enter search term into the search box
    and verify the results, enter certain repository and verify if certain data are showing as expected.

    When user go to the home page of GitHub
    Then user enter the term "hygieia" in the search box and search
    Then user check if the returned number of repository is equal to "308"
    # for the next step, couldn't find the repository with the name capitalone/Hygieia
    # so I found the following repository which I assumed is the correct one
    Then user select and click on repository named Hygieia/Hygieia
    Then user verify if the count of Commits is more than "2000"
    Then user verify if the count of Branches is more than "4"
    Then user verify if the count of Releases is at least "8"
    Then user verify if the count of Contributors is more than "50"
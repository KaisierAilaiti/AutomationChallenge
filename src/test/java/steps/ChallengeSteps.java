package steps;

import cucumber.api.java.en.*;
import pom.HomePage;
import pom.ResultPage;
import pom.SingleRepositoryPage;
import utilities.Driver;
import utilities.UtilMethods;

public class ChallengeSteps {


    @When("^user go to the home page of GitHub$")
    public void user_go_to_the_home_page_of_GitHub() throws Throwable {
        Driver.getDriver().get("https://github.com/");
        UtilMethods.iWait(5);
    }

    @Then("^user enter the term \"([^\"]*)\" in the search box and search$")
    public void user_enter_the_term_in_the_search_box_and_search(String name) throws Throwable {
        HomePage.search(name);
    }

    @Then("^user check if the returned number of repository is equal to \"([^\"]*)\"$")
    public void user_check_if_the_returned_number_of_repository_is_equal_to_expected_number(String expectedCount) throws Throwable {
        ResultPage.verify_repositories_counts(expectedCount);
        // used assertion, failed only if the expected result and actual result doesn't match
        // if passed, means the numbers are matching
    }

    @Then("^user select and click on repository named Hygieia/Hygieia$")
    public void user_select_and_click_on_repository_named_Hygieia_Hygieia() throws Throwable {
        ResultPage.click_repository();
    }

    @Then("^user verify if the count of Commits is more than \"([^\"]*)\"$")
    public void user_verify_if_the_count_of_Commits_is_more_than(String expectedCounts) throws Throwable {
        SingleRepositoryPage.verify_count_of_commits(expectedCounts);
    }

    @Then("^user verify if the count of Branches is more than \"([^\"]*)\"$")
    public void user_verify_if_the_count_of_Branches_is_more_than(String expectedCounts) throws Throwable {
        SingleRepositoryPage.verify_count_of_branches(expectedCounts);
    }

    @Then("^user verify if the count of Releases is at least \"([^\"]*)\"$")
    public void user_verify_if_the_count_of_Releases_is_at_least(String expectedCounts) throws Throwable {
        SingleRepositoryPage.verify_count_of_releases(expectedCounts);
    }

    @Then("^user verify if the count of Contributors is more than \"([^\"]*)\"$")
    public void user_verify_if_the_count_of_Contributors_is_more_than(String expectedCounts) throws Throwable {
        SingleRepositoryPage.verify_count_of_contributors(expectedCounts);
    }
}

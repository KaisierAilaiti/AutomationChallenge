package pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SingleRepositoryPage {
    public SingleRepositoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "li[class='commits']>a>span")
    public WebElement commits;

    @FindBy(css = "li>a[href='/Hygieia/Hygieia/branches']>span")
    public WebElement branches;

    @FindBy(css = "li>a[href='/Hygieia/Hygieia/releases']>span")
    public WebElement releases;

    @FindBy(css = "li>a[href='/Hygieia/Hygieia/graphs/contributors']>span")
    public WebElement contributors;

    public static void verify_count_of_commits(String expected) {
        SingleRepositoryPage srp = new SingleRepositoryPage();
        String actual = srp.commits.getText().replace(",", "");
        int actualCount = Integer.parseInt(actual);
        int expectedCount = Integer.parseInt(expected);
        if (actualCount > expectedCount) {
            System.out.println("Count of Commits is verified and passed");
        } else {
            System.out.println("Counts doesn't match the record");
        }
    }

    public static void verify_count_of_branches(String expected) {
        SingleRepositoryPage srp = new SingleRepositoryPage();
        int actualCount = Integer.parseInt(srp.branches.getText());
        int expectedCount = Integer.parseInt(expected);
        if (actualCount > expectedCount) {
            System.out.println("Count of Branches is verified and passed");
        } else {
            System.out.println("Counts doesn't match the record");
        }
    }

    public static void verify_count_of_releases(String expected) {
        SingleRepositoryPage srp = new SingleRepositoryPage();
        int actualCount = Integer.parseInt(srp.releases.getText());
        int expectedCount = Integer.parseInt(expected);
        if (actualCount >= expectedCount) {
            System.out.println("Count of Releases is verified and passed");
        } else {
            System.out.println("Counts doesn't match the record");
        }
    }


    public static void verify_count_of_contributors(String expected) {
        SingleRepositoryPage srp = new SingleRepositoryPage();
        int actualCount = Integer.parseInt(srp.contributors.getText());
        int expectedCount = Integer.parseInt(expected);
        if (actualCount > expectedCount) {
            System.out.println("Count of Contributors is verified and passed");
        } else {
            System.out.println("Counts doesn't match the record");
        }
    }
}

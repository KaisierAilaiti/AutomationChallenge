package pom;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.UtilMethods;

public class ResultPage {
    public ResultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@class='menu-item selected']/span[@data-search-type='Repositories']")
    public WebElement resultNumOfRepositories;

    @FindBy(css = "a[href='/Hygieia/Hygieia']")
    public WebElement repository;

    public static void verify_repositories_counts(String expected){
        ResultPage rp = new ResultPage();
        int actualCount = Integer.parseInt(rp.resultNumOfRepositories.getText());
        int expectedCount = Integer.parseInt(expected);
        Assert.assertEquals(actualCount, expectedCount);
    }

    public static void click_repository(){
        ResultPage rp = new ResultPage();
        rp.repository.click();
        UtilMethods.iWait(10);
    }


}

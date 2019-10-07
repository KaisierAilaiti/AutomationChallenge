package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.UtilMethods;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input[name='q']")
    public WebElement searchbox;

    public static void search(String name){
        HomePage hp = new HomePage();
        hp.searchbox.sendKeys(name + Keys.ENTER);
        UtilMethods.iWait(5);
    }
}

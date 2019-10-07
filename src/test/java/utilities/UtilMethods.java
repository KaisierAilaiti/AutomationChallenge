package utilities;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.util.concurrent.TimeUnit;

public class UtilMethods {
    public static void iWait(int second){
        Driver.getDriver().manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

}

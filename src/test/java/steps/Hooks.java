package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void set_up(){
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tear_down(){
        if(Driver.getDriver()!=null){
            Driver.getDriver().close();
        }
    }
}

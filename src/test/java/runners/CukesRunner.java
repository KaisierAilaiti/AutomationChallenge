package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "",
        plugin = "html:target/cucumber",
        monochrome = true,
      //  tags = "",
        dryRun = false
)
public class CukesRunner {
}

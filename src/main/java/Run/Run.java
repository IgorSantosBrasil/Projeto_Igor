package Run;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dell on 7.7.2017 г..
 */

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        tags = {"@Igor"},
        features = "src/main/resources/",
        glue = {"StepDefs"})

public class Run {

}

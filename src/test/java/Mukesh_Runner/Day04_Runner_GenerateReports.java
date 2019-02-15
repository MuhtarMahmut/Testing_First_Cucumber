package Mukesh_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(       features = "src/test/resources/features/Day04.feature",
        glue = "Mukesh_Steps",
        plugin = "html:target/cucumber-html-report"
)

public class Day04_Runner_GenerateReports {
}

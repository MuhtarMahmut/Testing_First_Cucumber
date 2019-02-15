package Mukesh_Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Day02.feature",
        glue = "Mukesh_Steps")
public class Day02_Runner_Parameters {
}

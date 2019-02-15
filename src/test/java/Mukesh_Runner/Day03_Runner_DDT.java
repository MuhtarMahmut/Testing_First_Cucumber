package Mukesh_Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import static ElementsOfBY.Day03_Elements.*;

@RunWith(Cucumber.class)
@CucumberOptions(       features = "src/test/resources/features/Day03.feature",
                          glue = "Mukesh_Steps"       )

public class Day03_Runner_DDT {



}

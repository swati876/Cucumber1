package stepRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "C:\\Cucumber1\\Features\\training.feature",
       glue={"stepDefinations"}
)

public class runner {

}


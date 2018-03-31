package practicalsqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumber","json:target/report.json"},
		features="src/test/resources/practicalsqa/features",
		glue="practicalsqa/step_definitions",
		dryRun=false
		,tags="@SergeiD"
		)

public class practicalsqaRunner {

}

package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		features = ".//Feature/myFeature.feature",
		glue = {"stepDefs"},
		plugin = {"pretty","html:target/cucumber-html-report","json:target/json/file.json"},
		dryRun = false,
		monochrome = true,//display the console output in a readable format.
		strict = true//it will check if any step is not defined in step definition file.

		)
public class runTest {

}

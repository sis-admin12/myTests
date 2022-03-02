package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Serghei.Matura/eclipse-workspace/MavenCucumber/Features/btn.feature",
		glue = "StepDefinition",
		monochrome = true,
		dryRun = false,
		plugin={"pretty","html:test-output-btn","json:json_output_btn/cucumber.json","junit:junit_xml_output_btn/cucumber.xml"}
		)
public class testRunnerBtn {

}

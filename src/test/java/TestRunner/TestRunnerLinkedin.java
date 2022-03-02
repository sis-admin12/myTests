package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Serghei.Matura/eclipse-workspace/MavenCucumber/Features/linkedin.feature",
		glue = "StepDefinition",
		monochrome = true,
		dryRun = false,
		plugin={"pretty","html:test-output-link","json:json_output_link/cucumber.json","junit:junit_xml_output_link/cucumber.xml"}
		)




public class TestRunnerLinkedin {

}

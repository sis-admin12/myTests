package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Serghei.Matura/eclipse-workspace/MavenCucumber/Features/email.feature",
		glue = "StepDefinition",
		monochrome = true,
		dryRun = false,
		plugin={"pretty","html:test-output-email","json:json_output_email/cucumber.json","junit:junit_xml_output_email/cucumber.xml"}
		)
public class TestRunnerEmail {

}

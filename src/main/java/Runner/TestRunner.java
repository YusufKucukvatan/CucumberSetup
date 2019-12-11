package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/yusufkucukvatan/Desktop/CucumberSetup/src/main/java/Features/login.feature",
        glue = {"StepDefinitions"},
        format = {"pretty", "html:test-output", "json:jason-output/cucumber.jason", "junit: junit-xml/cucumber.xml"}, //to generate different type of report format
        monochrome = true, //displays the console output in readable format
        strict = true, //It will stop testing immediately if there is any undefined step in step definition file was long as strict is true.
        dryRun = false
        )

public class TestRunner {
}

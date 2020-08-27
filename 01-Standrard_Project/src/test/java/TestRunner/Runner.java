package TestRunner;		

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



				
/*@CucumberOptions(features="Features",glue={"StepDefinition"}, tags="@feature2", plugin = {
        "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json", "rerun:target/rerun.txt",
        "junit:target/junit-report.xml", "testng:target/testng-output.xml" })*/
@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"StepDefinition"},
		plugin={"pretty", "html:target/cucumber-reports"},
		tags={"@feature1, @feature2"})
public class Runner {
	
}
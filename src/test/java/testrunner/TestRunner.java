package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // Using runwith annotation to make the class as start of the junit test -
@CucumberOptions(
		features = "src/test/java/features",
		glue ={"stepdefinition","hooks"},
		monochrome = true, // formating of the html report and the console 
		plugin = {"pretty","html:report/htmlreport" // generate html report
				,"json:report/jsonreport" //generate json report
				,"junit:report/xmlreport"},//generate xml report
		dryRun = false,// make it true to only to check all the steps in feature file are defined in the step definition
		//tags ={"@smoke","@regression"}//tags using AND condition
		//tags ={"@smoke,@regression"} //tags using OR condition
				//tags ={"~@smoke,@regression"} //skips the testcases
		tags ="@Assignment1"
		)
public class TestRunner {

}

package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/faileRerun.txt"
        },
        monochrome=true,
        features = "@target/faileRerun.txt",     //Path of features folder
        glue = {"stepdefinitions", "hooks"},      //Path of step definitions  //they are in sibling file, so I write just stepdefinitions
        dryRun = false,
        tags = "@failed_tests"       //dont run all of the features, just run scenario which has @....

)

public class FailedScenarioRunner {

}
/*
This runner class is used to run only failedrerun.txt file
That file only has failed scenarios if any scenario fails
That file will be empty if no scenario fails
We do not use tag or path of the features folder
 */
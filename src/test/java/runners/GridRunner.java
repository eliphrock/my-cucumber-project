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
        features = "./src/test/resources/feautures",     //Path of features folder
        glue = {"stepdefinitions"},      //Path of step definitions  //they are in sibling file, so I write just stepdefinitions
        dryRun = false,
        tags = "@grid_feature"       //dont run all of the features, just run scenario which has @....

)
public class GridRunner {
}

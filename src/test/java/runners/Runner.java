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
                "junit:target/xml-report/cucumber.xml"
        },
        monochrome=true,
        features = "./src/test/resources/feautures",     //Path of features folder
        glue = {"stepdefinitions", "hooks"},      //Path of step definitions  //they are in sibling file, so I write just stepdefinitions
        dryRun = false,
        tags = "@admin_excel"       //dont run all of the features, just run scenario which has @....

)

public class Runner {

}



//tags : this marks which feature file to run. we add this tag in the feature files

/*
 features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
 glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
 dryRun = false //IF dryRun = true. RUN DRY. JUST GIVE ME THE MISSING STEP DEFINITIONS. DON'T RUN THE TEST CASES.
 dryRun= false when we are doing test execution.
 dryRun=true when we are generation missing step definitions
 plugin is used to add reports.
 pretty:makes the report more readable, pretty
 monochrome=false  -->text is green,  monochrome=true-->text is black on the console
*/

//go target-->default-cucumber-reports.html -->right click-->open in browser




/*


    @RunWith is used to run the class.
    Without this, Runner class will not  be runnable
    @CucumberOptions is used to add  feature path, step definition
    path,tags, dryRun, report plug ins


    features : path of the features folder. this can point path of specific feature file
    glue : path of step definitions folder.  this can point path of specific step definition  class
    tags : this marks which feature file to run. we add this tag in the feature files
    dryRun : -dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)


    * -dryRun takes 2 values, true or false
    * -dryRun = false :Runs tests on the browser while checking if there is any JAVA code missing
    * -dryRun = true :Runs tests without browser while checking if there is any JAVA code missing


        bir framework'de bir tek Runner class;i yeterli olabilir
        Runner class'inda class body'sinde hic bir sey olmaz
        Runner class'imizi onemli yapan 2 adet annotation vardir
        @RunWith(Cucumber.class) annotation Runner class'ina calisma ozelligi katar
        Bu annotation oldugu icin Cucumber framework 'umuzde Junit kullanmayi tercih ediyoruz
     */
/*
 features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
 glue = "stepdefinitions", //PATH OF STEP DEFINITIONS
 dryRun = false //IF dryRun = true. RUN DRY. JUST GIVE ME THE MISSING STEP DEFINITIONS. DON'T RUN THE TEST CASES.
 dryRun= false when we are doing test execution. dryRun=true when we are generation missing step definitions
*/
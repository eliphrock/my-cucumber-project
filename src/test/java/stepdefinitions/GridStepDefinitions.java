package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefinitions {
    WebDriver driver;
    @Given("user is on the application_url using chrome")
    public void user_is_on_the_application_url_using_chrome() throws MalformedURLException {
        URL remoteURL= new URL("http://192.168.2.11:4444");

        //create remotewebdriver
        driver=new RemoteWebDriver(remoteURL,new ChromeOptions());
        //grid steps are done.....
        //rest is the same as normal test cases
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.techproeducation.com");


    }
    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {
        Assert.assertTrue(driver.getTitle().contains(string));

    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();
    }
    @Given("user is on the application_url using firefox")
    public void user_is_on_the_application_url_using_firefox() throws MalformedURLException {
        URL remoteURL= new URL("http://192.168.2.11:4444");

        //create remotewebdriver
        driver=new RemoteWebDriver(remoteURL,new FirefoxOptions());
        //grid steps are done.....
        //rest is the same as normal test cases
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.techproeducation.com");
    }
}
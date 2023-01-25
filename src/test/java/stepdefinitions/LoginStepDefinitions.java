package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

import java.util.List;

public class LoginStepDefinitions {
    LoginPage loginPage=new LoginPage();
    @Given("user enters customer_email and customer_password")
    public void user_enters_customer_email_and_customer_password(DataTable credentials) {
        List<String> customerData = credentials.row(1);//row index start at 0
//        System.out.println(customerData.get(0));
//        System.out.println(customerData.get(1));

        loginPage.username.sendKeys(customerData.get(0));
        loginPage.password.sendKeys(customerData.get(1));







    }
    @Then("verify the application login is successful")
    public void verify_the_application_login_is_successful() {

    }
}

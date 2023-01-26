package stepdefinitions;

import io.cucumber.java.en.When;
import pages.MedunnaRoomPage;
import utilities.ReusableMethods;

public class MedunnaRoomStepDefs {

    MedunnaRoomPage medunnaRoomPage=new MedunnaRoomPage();
    @When("click on Items&Titles")
    public void clickOnItemsTitles() {
        ReusableMethods.waitFor(1);


    }

}
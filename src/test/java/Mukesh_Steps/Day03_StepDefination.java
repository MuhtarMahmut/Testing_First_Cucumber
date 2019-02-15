package Mukesh_Steps;

import Utilities.TestBase;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import static ElementsOfBY.Day03_Elements.*;

public class Day03_StepDefination extends TestBase {

    @Given("Browser and Website should be ready")
    public void browser_and_Website_should_be_ready() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        SetUp();
    }

    @When("I Entered the  {string} and the {string}")
    public void i_Entered_the_and_the(String string, String string2) {
        mylib.click(FirstClcikTheSignin);
        mylib.sendkesy(EnterEmail,string+ Keys.ENTER);
        mylib.sendkesy(EnterPassWord,string2+Keys.ENTER);
    }

    @Then("I should be loged in.")
    public void i_should_be_loged_in() {

    }

}

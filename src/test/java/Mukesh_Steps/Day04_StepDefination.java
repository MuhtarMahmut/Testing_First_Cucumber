package Mukesh_Steps;

import Utilities.TestBase;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import static ElementsOfBY.Day03_Elements.EnterEmail;
import static ElementsOfBY.Day03_Elements.EnterPassWord;
import static ElementsOfBY.Day03_Elements.FirstClcikTheSignin;
import static ElementsOfBY.Day04_Elements.*;

public class Day04_StepDefination extends TestBase {

    @Given("Browser is set and website is open")
    public void browser_is_set_and_website_is_open() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.yahoo.com/");
            SetUp();
    }

    @When("someone Entered {string} and {string}")
    public void someone_Entered_and(String string, String string2) {
        mylib.click(FirstClcikTheSignin);
        mylib.sendkesy(EnterEmail,string+ Keys.ENTER);
        mylib.sendkesy(EnterPassWord,string2+Keys.ENTER);
    }

    @Then("User can log in and then website closes.")
    public void user_can_log_in_and_then_website_closes() {
                mylib.sleeps(5);
    }


}

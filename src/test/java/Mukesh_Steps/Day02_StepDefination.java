package Mukesh_Steps;

import Utilities.TestBase;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static ElementsOfBY.Day02Elements.*;

public class Day02_StepDefination extends TestBase {


    @Given("Open Chrome and got to the Gmail sign in Website")
    public void open_Chrome_and_got_to_the_Gmail_sign_in_Website() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://accounts.google.com");
            SetUp();

    }

    @When("I Enter Valid {string} and valid {string}")
    public void i_Enter_Valid_and_valid(String username, String password) {
      mylib.sendkesy(Email,username+ Keys.ENTER);
      mylib.sendkesy(PassWord,password+ Keys.ENTER);

    }

    @Then("User Should be able to login successfully")
    public void user_Should_be_able_to_login_successfully() {
        // Write code here that turns the phrase above into concrete actions


    }

}

package Mukesh_Steps;

import Credentials.CredentialsforYahoo;
import Utilities.*;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import static ElementsOfBY.Day01Elements.*;

public class Day01_StepDefination extends TestBase {

    @Given("Browser is ready and website is uploaded")
    public void browser_is_ready_and_website_is_uploaded() {
        WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
                driver.get("https://www.yahoo.com/");
                    SetUp();
    }

    @When("enters valid username and password")
    public void enters_valid_username_and_password() {
        mylib.click(FirstClcikTheSignin);
        mylib.sendkesy(EnterEmail, CredentialsforYahoo.getUserName()+ Keys.ENTER);
        mylib.sendkesy(EnterPassWord,CredentialsforYahoo.getPassWord()+Keys.ENTER);
    }

    @Then("user should be loged in.")
    public void user_should_be_loged_in() {

    }

}

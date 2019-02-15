package ElementsOfBY;

import org.openqa.selenium.By;

public class Day01Elements {
    public static By FirstClcikTheSignin= By.xpath(".//a[@id='uh-signin']"),
            EnterEmail=By.xpath(".//input[@placeholder='Enter your email']"),
            NextButtonAfterEmail=By.xpath(".//input[@value='Next']"),
            EnterPassWord=By.xpath(".//input[@id='login-passwd']"),
            SignInAfterPassword=By.xpath(".//button[@id='login-signin']");
}

package ElementsOfBY;

import Mukesh_Steps.Day02_StepDefination;
import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day02Elements extends TestBase {

    public static By Email=By.xpath(".//input[@type='email']"),
                      NextAfterEmail=By.xpath("//*[@id='identifierNext']/content/span"),
                      PassWord=By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"),
                      NextAfterPassWord=By.xpath(".//*[@id='passwordNext']/content");




}

package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {
   public WebDriver driver;
   public Libraries mylib;
   public WebDriverWait wait;
   public Actions action;
   public Select select;


    public void SetUp(){
        mylib=new Libraries(driver);
        action=new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
        wait =new WebDriverWait(driver,10);
    }
}

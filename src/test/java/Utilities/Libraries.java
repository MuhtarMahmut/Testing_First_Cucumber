package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Libraries extends TestBase{


    WebDriver driver;

    public Libraries(WebDriver driver){
        this.driver=driver;
    }
    public void sleeps(double a){

        try {   Thread.sleep((int)(a*1000));
        } catch (InterruptedException e) {
            e.printStackTrace(); }

    }

    public void sendkesy(By e, String text){
        WebElement A=driver.findElement(e);
        A.sendKeys(text);
    }

    public void click(By e){
        WebElement A=driver.findElement(e);
        A.click();
    }

    public void MoveToElement(By e){
        WebElement a=driver.findElement(e);
        action.moveToElement(a).perform();
    }

    public void MoveToElementThenClick(By e){
        WebElement a=driver.findElement(e);
        action.moveToElement(a).click().perform();
    }
    public void SetUpSelect(By e){
        WebElement a=driver.findElement(e);
        select=new Select(a);
    }

}

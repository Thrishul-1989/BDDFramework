package pages;

import commonfunctions.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    // Declear the pageobjects
    WebDriver driver = null;

    public HomePage(){
        this.driver= DriverHelper.driver;
    }

    By accptectAll=By.id("onetrust-accept-btn-handler");

    public void clickOnAccept(){
      //  DriverHelper.driver.findElement(accptectAll).click();
        driver.findElement(accptectAll).click();
    }





}

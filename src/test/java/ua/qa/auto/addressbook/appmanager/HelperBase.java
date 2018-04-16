package ua.qa.auto.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by PDM-ko on 12.04.2018.
 */

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        click(locator);

        if(text != null){
            String existingText = driver.findElement(locator).getAttribute("value");

            if( existingText.equals(text) ){
                // ничего делать не нужно
            }
            else{
                driver.findElement(locator).clear();
                driver.findElement(locator).sendKeys(text);
                 }
        }
        else {// ничего делать не нужно
        }
    }
}

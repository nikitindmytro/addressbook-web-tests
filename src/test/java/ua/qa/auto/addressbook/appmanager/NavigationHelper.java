package ua.qa.auto.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by PDM-ko on 30.03.2018.
 */
public class NavigationHelper {
   private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver=driver;
    }

    public void gotoGroupPage() {
      driver.findElement(By.linkText("GROUPS")).click();
    }
}

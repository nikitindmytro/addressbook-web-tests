package ua.qa.auto.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by PDM-ko on 30.03.2018.
 */
public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver driver) {
        super(driver);
    }

    public void gotoGroupPage() {
      click(By.linkText("GROUPS"));
    }
}

package ua.qa.auto.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.qa.auto.addressbook.model.ContactData;

/**
 * Created by PDM-ko on 16.04.2018.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
    }

    public void submitContactCreation() { click(By.xpath("(//input[@name='submit'])[2]")); }
    public void gotoContactModificationPage() { click(By.xpath("//img[@alt='EDIT']")); }

    public void submitContactUpdate() { click(By.xpath("(//input[@name='update'])[2]")); }
}

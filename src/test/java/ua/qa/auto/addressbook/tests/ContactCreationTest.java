package ua.qa.auto.addressbook.tests;

import org.testng.annotations.*;
import ua.qa.auto.addressbook.model.ContactData;

/**
 * Created by PDM-ko on 16.04.2018.
 */
public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {

        app.getNavigationHelper().gotoContactCreationPage();
        app.getContactHelper().fillContactForm(
               new ContactData("Ivan","Petrov","Lviv","3809312345678","IPetrov@gmail.com"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().gotoHomePage();
    }

}

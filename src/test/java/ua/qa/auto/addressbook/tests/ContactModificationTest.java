package ua.qa.auto.addressbook.tests;

import org.testng.annotations.*;
import ua.qa.auto.addressbook.model.ContactData;

/**
 * Created by PDM-ko on 18.04.2018.
 */
public class ContactModificationTest extends TestBase{

    @Test
    public void testContactModification() throws Exception {

        app.getContactHelper().gotoContactModificationPage();
        app.getContactHelper().fillContactForm(
                new ContactData(null,null,"Odessa","3809755555555","IvanPetrov@gmail.com"));
        app.getContactHelper().submitContactUpdate();
        app.getNavigationHelper().gotoHomePage();
    }

}
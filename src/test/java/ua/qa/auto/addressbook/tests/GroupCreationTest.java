package ua.qa.auto.addressbook.tests;

import org.testng.annotations.*;
import ua.qa.auto.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
  public void testGroupCreation() throws Exception {
   // driver.get("http://localhost/addressbook/");
   // login("admin", "secret");
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}

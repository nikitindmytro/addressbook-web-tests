package ua.qa.auto.addressbook.tests;

import org.testng.annotations.*;
import ua.qa.auto.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase {

    @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}

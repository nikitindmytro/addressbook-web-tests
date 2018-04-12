package ua.qa.auto.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {

      // driver.get("http://localhost/addressbook/");
      // login("admin", "secret");
      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSelectedGroup();
      app.getGroupHelper().returnToGroupPage();
  }

}

package ua.qa.auto.addressbook.tests;

import org.testng.annotations.Test;
import ua.qa.auto.addressbook.model.GroupData;

/**
 * Created by PDM-ko on 13.04.2018.
 */
public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("TEST_1", "TEST_2", "TEST_3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();

    }
}

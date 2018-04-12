package ua.qa.auto.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.qa.auto.addressbook.appmanager.ApplicationManager;

/**
 * Created by PDM-ko on 29.03.2018.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void beforeEveryTest() {

        app.init();
    }


    @AfterClass
    public void afterEveryTest() {
        app.stop();
    }

}

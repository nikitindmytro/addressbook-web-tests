package ua.qa.auto.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by PDM-ko on 30.03.2018.
 */
public class ApplicationManager {
    WebDriver driver;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browserType) {
        this.browser = browserType;
    }

    public void init() {

        if(browser == BrowserType.CHROME) {
            System.setProperty("webdriver.chrome.driver", "D:/Software/Selenium/chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser == BrowserType.FIREFOX) {
            System.setProperty("webdriver.gecko.driver", "D:/Software/Selenium/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if(browser == BrowserType.IE) {
            System.setProperty("webdriver.ie.driver", "D:/Software/Selenium/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }


        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}

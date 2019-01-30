import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        wd.quit();
    }

    public void click(By by) {
        wd.findElement(by).click();
    }

    public String getTitle() {
        return wd.getTitle();
    }

    public void openWebSite() {
        wd.get("http://thingtelecom.com/");
    }

    public String getUrl() {
        return wd.getCurrentUrl();
    }

    public String getText(By by) {
        return wd.findElement(by).getText();
    }
    public void fillField(By by, String value) {
        wd.findElement(by).click();
        wd.findElement(by).clear();
        wd.findElement(by).sendKeys(value);
    }
}

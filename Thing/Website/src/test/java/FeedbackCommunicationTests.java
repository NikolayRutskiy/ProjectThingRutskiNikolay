import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FeedbackCommunicationTests extends TestBase {
    @Test
    public void positiveFillingFieldsIsraelNumber() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@gmail.com");
        fillField(By.cssSelector("[type='tel']"), "0542177867");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void PositiveFillingFieldsRussianName() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Алексей");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@gmail.com");
        fillField(By.cssSelector("[type='tel']"), "0542177867");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void PositiveFillingFieldsHebrewName() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "דוד");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@gmail.com");
        fillField(By.cssSelector("[type='tel']"), "0542177867");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void PositiveFillingFieldsRussianNumber() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@gmail.com");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void PositiveFillingFieldsRussianEmail() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@mail.ru");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void PositiveFillingFieldsIsraelEmail() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@fdx.co.il");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void PositiveFillingFieldsEmptyEmail() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class*=\'wpcf7-response\']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void NegativeFillingFieldsWrongEmail() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey1234");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.xpath("//span[text()='The e-mail address entered is invalid.']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void NegativeFillingFieldsWrongEmail2() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey@alex");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.xpath("//span[text()='The e-mail address entered is invalid.']"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void NegativeFillingFieldsEmptyName() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@fdx.co.il");
        fillField(By.cssSelector("[type='tel']"), "89295868519");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class='wpcf7-form-control-wrap your-name'] span"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
    @Test
    public void NegativeFillingFieldsEmptyPhone() throws InterruptedException {
        openWebSite();
        fillField(By.cssSelector("[type='text']"), "Aleksey");
        fillField(By.cssSelector("[type='email']"), "aleksey1234@fdx.co.il");
        fillField(By.cssSelector("[type='tel']"), "");
        click(By.cssSelector("[type='submit'"));
        WebElement response = wd.findElement(By.cssSelector("[class='wpcf7-form-control-wrap your-tel'] span"));
        Thread.sleep(3000);
        Assert.assertTrue(response.isDisplayed());
    }
}

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLinksTests extends TestBase {
    //checking links to application markets
    @Test
    public void openAndroidMarketHeader()
    {
        openWebSite();
        click(By.cssSelector(".header [href*=\"com.thing.rcs\"]"));
        Assert.assertEquals(getTitle(), "Thing! No Cost Calling. Free International calls - Apps on Google Play" );
    }
    @Test
    public void openAppleMarketHeader()
    {
        openWebSite();
        click(By.cssSelector(".header [href*='itunes']"));
        Assert.assertEquals(getTitle(),"\u200EThing! - The new calling app on the App Store");
    }
    @Test
    public void openAndroidMarketMainBlock()
    {
        openWebSite();
        click(By.cssSelector(".main_block [href*=\"com.thing.rcs\"]"));
        Assert.assertEquals(getTitle(), "Thing! No Cost Calling. Free International calls - Apps on Google Play" );
    }
    @Test
    public void openAppleMarketMainBlock()
    {
        openWebSite();
        click(By.cssSelector(".main_block [href*='itunes']"));
        Assert.assertEquals(getTitle(),"\u200EThing! - The new calling app on the App Store");
    }
    //checking links to contact emails
    @Test
    public void SendEmailGeneralInfoInBody()
    {
        openWebSite();
        click(By.xpath("//li[@id='menu-item-36']/child::a[text()='Contact us']"));
        click(By.cssSelector(".details [href^='mailto:Info']"));
        Assert.assertTrue(getUrl() !="http://thingtelecom.com/contact-us/mailto:Info@thingtelecom.com");
            }
    @Test
    public void SendEmailGeneralInfoInFooter()
    {
        openWebSite();
        click(By.xpath("//li[@id='menu-item-36']/child::a[text()='Contact us']"));
        click(By.cssSelector(".contact [href^='mailto:Info']"));
        Assert.assertTrue(getUrl() !="http://thingtelecom.com/contact-us/mailto:Info@thingtelecom.com");
    }
    @Test
    public void SendEmailAccounting()
    {
        openWebSite();
        click(By.xpath("//li[@id='menu-item-36']/child::a[text()='Contact us']"));
        click(By.cssSelector("[href^='mailto:billing']"));
        Assert.assertTrue(getUrl() !="http://thingtelecom.com/contact-us/mailto:billing@thingtelecom.com");
    }
    //checking internal links
    @Test
    public void callingWithThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='Thing!s']"));
        click(By.xpath("//a[text()='Calling with Thing!']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Calling with Thing!");
    }
    @Test
    public void chattingWithThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='Thing!s']"));
        click(By.xpath("//a[text()='Chatting with Thing!']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Chatting with Thing!");
    }
    @Test
    public void sharingWithThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='Thing!s']"));
        click(By.xpath("//a[text()='Sharing with Thing!']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Sharing with Thing!");
    }
    @Test
    public void funAndFreeThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='Thing!s']"));
        click(By.xpath("//a[text()='Fun and Free Thing!']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Fun and Free Thing!");
    }
    @Test
    public void allCallingThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='All Calling Thing!s']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Calling with Thing!");
    }
    @Test
    public void allChatThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='All Chat Thing!s']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Chatting with Thing!");
    }
    @Test
    public void allSharingThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='All Sharing Thing!s']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Sharing with Thing!");
    }
    @Test
    public void allFunThing()
    {
        openWebSite();
        click(By.xpath("//a[text()='All Fun Thing!s']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Fun and Free Thing!");
    }
    @Test
    public void contactUs()
    {
        openWebSite();
        click(By.cssSelector("div.header [href*='contact']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Contact us");
    }
    @Test
    public void weHire()
    {
        openWebSite();
        click(By.cssSelector("div.header [href*='we']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"We hire");
    }
    @Test
    public void goToMainPageHeader()
    {
        openWebSite();
        click(By.cssSelector("div.header [href*='contact']"));
        click(By.cssSelector(".logo"));
        Assert.assertEquals(getUrl(),"http://thingtelecom.com/");
    }
    @Test
    public void homeFooter()
    {
        openWebSite();
        click(By.cssSelector("div.header [href*='we']"));
        click(By.cssSelector("#menu-item-42>a"));
        Assert.assertEquals(getUrl(),"http://thingtelecom.com/");
    }
    @Test
    public void weHireFooter()
    {
        openWebSite();
        click(By.cssSelector(".footer_menu [href*='we']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"We hire");
    }
    @Test
    public void contactUsFooter()
    {
        openWebSite();
        click(By.cssSelector(".footer_menu [href*='contact']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Contact us");
    }
    @Test
    public void privacyPolicy()
    {
        openWebSite();
        click(By.cssSelector(".footer_menu [href*='privacy']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Privacy policy");
    }
    @Test
    public void endUserLicenseAgreement()
    {
        openWebSite();
        click(By.cssSelector(".footer_menu [href*='end']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"End user license agreement");
    }
    @Test
    public void termsAndConditions()
    {
        openWebSite();
        click(By.cssSelector(".footer_menu [href*='terms']"));
        Assert.assertEquals(getText(By.xpath("//h1")),"Terms and conditions");
    }
}

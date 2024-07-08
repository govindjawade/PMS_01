package TestPmsLoginPage;

import PMSLoginPages.ActiveLinks;
import PMSLoginPages.LoginTest;
import PMSLoginPages.OtpTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestActiveLinks {
    public WebDriver driver;

    @Test
    public void testActiveLinks() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg = new LoginTest(driver);
        lg.setTxtUsername("raj@yopmail.com");
        lg.setTxtpassword("Admin@321");
        Thread.sleep(3000);

        lg.Loginbuttonclick();

        Thread.sleep(5000);
        String actual = driver.getCurrentUrl();
        String excepted = "https://pms.hplbusiness.com/otp";

        Assert.assertEquals(excepted, actual);
        OtpTest ot = new OtpTest(driver);
        ot.setOtpText();

        //ot.setCheckbox();
        Thread.sleep(10000);
        ot.setTxtVerify();
        Thread.sleep(3000);
        String actualmessage = ot.setSuccessfulToast();
        String expectedmessage = "OTP Verified successfully";
        Assert.assertEquals(expectedmessage, actualmessage);
        Thread.sleep(5000);
        ActiveLinks ac = new ActiveLinks(driver);
        Thread.sleep(5000);
        ac.activeLinkLeftMenu();
        Thread.sleep(5000);
        ac.activeLinkMasterFiles();
        Thread.sleep(5000);
        ac.activeLinkEntitySetFiles();
    }
}

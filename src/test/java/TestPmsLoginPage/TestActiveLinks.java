package TestPmsLoginPage;

import PMSLoginPages.ActiveLinks;
import PMSLoginPages.LoginTest;
import PMSLoginPages.OtpTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestActiveLinks {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://pms.hplbusiness.com/login");
    }
    @BeforeMethod
    public void loginAndValidateOtp() throws InterruptedException {
        LoginTest lg = new LoginTest(driver);
        lg.setTxtUsername("raj@yopmail.com");
        lg.setTxtpassword("Admin@321");
        Thread.sleep(3000);
        lg.Loginbuttonclick();
        Thread.sleep(5000);

        String actual = driver.getCurrentUrl();
        String expected = "https://pms.hplbusiness.com/otp";
        Assert.assertEquals(expected, actual);

        OtpTest ot = new OtpTest(driver);
        ot.setOtpText();
        Thread.sleep(10000);
        ot.setTxtVerify();
        Thread.sleep(3000);

        String actualMessage = ot.setSuccessfulToast();
        String expectedMessage = "OTP Verified successfully";
        Assert.assertEquals(expectedMessage, actualMessage);
        Thread.sleep(5000);
    }

    @Test
    public void testActiveLinks() throws InterruptedException {
        ActiveLinks ac = new ActiveLinks(driver);
        Thread.sleep(5000);
        ac.activeLinkLeftMenu();
        Thread.sleep(5000);
        ac.activeLinkMasterFiles();
        Thread.sleep(5000);
        ac.activeLinkEntitySetFiles();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

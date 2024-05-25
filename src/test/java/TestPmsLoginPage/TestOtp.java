package TestPmsLoginPage;

import PMSLoginPages.LoginTest;
import PMSLoginPages.OtpTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestOtp {
    public WebDriver driver;

    @Test
    public void otpValidation() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg = new LoginTest(driver);
        lg.setTxtUsername("govindjawade19@gmail.com");
        lg.setTxtpassword("Gjawade@19");
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

    }

    @Test
    public void invalidOtp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg1 = new LoginTest(driver);
        lg1.setTxtUsername("govindjawade19@gmail.com");
        lg1.setTxtpassword("Gjawade@19");
        Thread.sleep(3000);
        lg1.Loginbuttonclick();
        Thread.sleep(3000);
        OtpTest ot1 = new OtpTest(driver);
        ot1.setInvalidOtpText();
        Thread.sleep(10000);
        ot1.setTxtVerify();
        Thread.sleep(3000);
        String actual = ot1.setInvalidOtpToast();

        String excepted = "OTP is invalid";

        Assert.assertEquals(excepted, actual);
    }
}

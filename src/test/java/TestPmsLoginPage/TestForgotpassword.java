package TestPmsLoginPage;

import PMSLoginPages.ForgotPasswordTest;
import PMSLoginPages.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestForgotpassword {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://pms.hplbusiness.com/login");
    }

    @Test
    public void forgotpassword() throws InterruptedException {

        LoginTest lg = new LoginTest(driver);
        lg.setLinkforgotpassword();
        Thread.sleep(4000);
        ForgotPasswordTest fg = new ForgotPasswordTest(driver);
        fg.setEmailaddres("raj@yopmail.com");
        Thread.sleep(4000);
        fg.setSendInstrButton();
        Thread.sleep(3000);
        String excepted = "Password Reset mail has been sent on your registered email id";

        String actual = fg.resetEmailLink();

        Assert.assertEquals(excepted, actual);
    }

    @Test
    public void InvalidEmail() throws InterruptedException {

        LoginTest lg = new LoginTest(driver);
        lg.setLinkforgotpassword();
        ForgotPasswordTest fg = new ForgotPasswordTest(driver);
        Thread.sleep(3000);
        fg.setEmailaddres("w@gmaill.com");
        Thread.sleep(2000);
        fg.setSendInstrButton();
        Thread.sleep(4000);
        String excepted = "Email address pattern is invalid.";
        String actual = fg.setInvalidEmailAdress();

        Assert.assertEquals(excepted, actual);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
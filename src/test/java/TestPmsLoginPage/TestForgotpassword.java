package TestPmsLoginPage;

import PMSLoginPages.ForgotPasswordTest;
import PMSLoginPages.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForgotpassword {

    @Test
    public void forgotpassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg = new LoginTest(driver);
        lg.setLinkforgotpassword();
        Thread.sleep(4000);
        ForgotPasswordTest fg=new ForgotPasswordTest(driver);
        fg.setEmailaddres("rosas@yopmail.com");
        Thread.sleep(4000);
        fg.setSendInstrButton();
        Thread.sleep(3000);
        String excepted="User account is locked.Please contact system administrator to unlock your account.";

        String actual=fg.setAccountLocked();

        Assert.assertEquals(excepted,actual);
    }
    @Test
    public void InvalidEmail() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg=new LoginTest(driver);
        lg.setLinkforgotpassword();
        ForgotPasswordTest fg=new ForgotPasswordTest(driver);
        Thread.sleep(3000);
        fg.setEmailaddres("w");
        Thread.sleep(2000);
        fg.setSendInstrButton();
        Thread.sleep(4000);
        String excepted="Email address pattern is invalid.";
        String actual= fg.setInvalidEmailAdress();

        Assert.assertEquals(excepted,actual);
    }

}
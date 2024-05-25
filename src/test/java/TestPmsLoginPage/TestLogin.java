package TestPmsLoginPage;

import PMSLoginPages.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogin {
    public WebDriver driver;

    @Test(priority = 1)
    public void loginTestValid() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg = new LoginTest(driver);
        lg.setTxtUsername("rosas@yopmail.com");
        lg.setTxtpassword("Rosas@123");
        Thread.sleep(4000);
        lg.Loginbuttonclick();

    }

    @Test(priority = 2)
    public void loginTestInvalidpassword() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg = new LoginTest(driver);
        lg.setTxtUsername("link1@yopmail.com");
        lg.setTxtpassword("Admin@12");
        Thread.sleep(5000);
        lg.Loginbuttonclick();
        Thread.sleep(3000);
        String expected = "Invalid credentials. Please try again with valid credentials.";
        String actual = lg.getToastmessage();
        Thread.sleep(4000);
        Assert.assertEquals(expected.trim(), actual.trim());


    }

    @Test(priority = 3)
    public void loginTestBlank() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg = new LoginTest(driver);
        lg.setTxtUsername("");
        lg.setTxtpassword("");
        Thread.sleep(4000);
        lg.Loginbuttonclick();

    }
    @Test(priority = 4)
    public void invalidUser() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pms.hplbusiness.com/login");

        LoginTest lg=new LoginTest(driver);
        lg.setTxtUsername("terence@gmail.com");
        lg.setTxtpassword("Admin@123");
        Thread.sleep(3000);

        String Excepted="User detail does not exists in system";
        String actual=lg.getToastmessageinvaliduser();
        Thread.sleep(4000);

        Assert.assertEquals(Excepted.trim(),actual.trim());



    }


}
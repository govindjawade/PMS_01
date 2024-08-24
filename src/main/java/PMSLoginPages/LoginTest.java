package PMSLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {
    public WebDriver driver;

    @FindBy(name = "usename")
    WebElement textusername;
    @FindBy(name = "password")
    WebElement textpassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbutton;

    @FindBy(xpath = "//a[contains(text(),' Forgot Password? ')]")
    WebElement linkforgotpassword;

    //toast message invalid creds
    @FindBy(css = "#toast-container")
    WebElement ErrorMessage;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTxtUsername(String user) {
        textusername.sendKeys(user);
    }

    public void setTxtpassword(String password) {
        textpassword.sendKeys(password);
    }

    public void Loginbuttonclick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("ngx-overlay")));
        loginbutton.click();
    }

    public void setLinkforgotpassword() {
         linkforgotpassword.click();
    }

    public String getToastmessage() {
        return ErrorMessage.getText();
    }
}

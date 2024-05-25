package PMSLoginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {


    @FindBy(name = "usename")
    WebElement textusername;

    @FindBy(name = "password")
    WebElement textpassword;

    @FindBy(tagName = "button")
    WebElement loginbutton;

    @FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
    WebElement linkforgotpassword;


    //toast message invalid creds
    @FindBy(css = "#toast-container")
    WebElement ErrorMessage;

    //toast message invalid user
    @FindBy(css = "#toast-container")
    WebElement toastMessage;

    public LoginTest(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setTxtUsername(String user) {
        textusername.sendKeys(user);
    }

    public void setTxtpassword(String password) {
        textpassword.sendKeys(password);
    }

    public void Loginbuttonclick() {
        loginbutton.click();
    }

    public void setLinkforgotpassword() {
        linkforgotpassword.click();
    }

    public String getToastmessage() {
        String toastMessage = ErrorMessage.getText();
        return toastMessage;
    }

    public String getToastmessageinvaliduser() {
        String message = toastMessage.getText();
        return message;
    }
}

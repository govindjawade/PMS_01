package PMSLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class OtpTest {
    public WebDriver driver;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    WebElement checkbox;
    @FindBy(tagName = "button")
    WebElement txtVerify;

    @FindBy(id = "toast-container")
    WebElement SuccessfulToast;

    @FindBy(id = "toast-container")
    WebElement InvalidOtp;

    public OtpTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setOtpText() {
        String otpValue = "555555";
        List<WebElement> otpDigits = driver.findElements(By.cssSelector("input[id^='otp_']"));
        for (int i = 0; i < otpValue.length() && i < otpDigits.size(); i++) {
            char digit = otpValue.charAt(i);
            otpDigits.get(i).sendKeys(String.valueOf(digit));
        }
    }

    public void setInvalidOtpText() {
        String otpValue = "125478";
        List<WebElement> otpDigits = driver.findElements(By.cssSelector("input[id^='otp_']"));
        for (int i = 0; i < otpValue.length() && i < otpDigits.size(); i++) {
            char digit = otpValue.charAt(i);
            otpDigits.get(i).sendKeys(String.valueOf(digit));
        }
    }

    public void setCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        checkbox.click();
    }

    public void setTxtVerify() {
        txtVerify.click();

    }

    public String setSuccessfulToast() {
        String ToastMessage = SuccessfulToast.getText();
        return ToastMessage;
    }

    public String setInvalidOtpToast() {
        String otpinvalid = InvalidOtp.getText();
        return otpinvalid;
    }
}


